package zemberek.morphology.analysis;

import org.junit.Assert;
import org.junit.Test;
import zemberek.core.turkish.SecondaryPos;
import zemberek.morphology.analysis.tr.TurkishMorphology;

import java.io.IOException;
import java.util.List;

public class WordAnalysisFormatterTest {

    @Test
    public void formatNonProperNoun() throws IOException {
        TurkishMorphology morphology = TurkishMorphology.builder()
                .addDictionaryLines("elma", "kitap", "demek", "evet").build();

        String[] inputs = {"elmamadaki", "elma", "kitalarımdan", "kitabımızsa", "diyebileceğimiz", "dedi", "evet"};

        WordAnalysisFormatter formatter = new WordAnalysisFormatter();

        for (String input : inputs) {
            List<WordAnalysis> results = morphology.analyze(input);
            for (WordAnalysis result : results) {
                Assert.assertEquals(input, formatter.format(result));
            }
        }
    }

    @Test
    public void formatKnownProperNouns() throws IOException {
        TurkishMorphology morphology = TurkishMorphology.builder()
                .addDictionaryLines("Ankara", "Iphone [Pr:ayfon]", "Google [Pr:gugıl]").build();

        String[] inputs = {"ankarada", "ıphonumun", "googledan", "Iphone", "Google", "Googlesa"};
        String[] expected = {"Ankara'da", "Iphone'umun", "Google'dan", "Iphone", "Google", "Google'sa"};

        WordAnalysisFormatter formatter = new WordAnalysisFormatter();

        int i = 0;
        for (String input : inputs) {
            List<WordAnalysis> results = morphology.analyze(input);
            for (WordAnalysis result : results) {
                if (result.getDictionaryItem().secondaryPos == SecondaryPos.ProperNoun) {
                    Assert.assertEquals(expected[i], formatter.format(result));
                }
            }
            i++;
        }
    }


    @Test
    public void formatToCase() throws IOException {
        TurkishMorphology morphology = TurkishMorphology.builder()
                .addDictionaryLines("kış", "şiir", "Aydın", "Google [Pr:gugıl]").build();

        String[] inputs =
                {"aydında", "googledan", "Google", "şiirde", "kışçığa", "kış"};

        String[] expectedDefaultCase =
                {"Aydın'da", "Google'dan", "Google", "şiirde", "kışçığa", "kış"};
        String[] expectedLowerCase =
                {"aydın'da", "google'dan", "google", "şiirde", "kışçığa", "kış"};
        String[] expectedUpperCase =
                {"AYDIN'DA", "GOOGLE'DAN", "GOOGLE", "ŞİİRDE", "KIŞÇIĞA", "KIŞ"};
        String[] expectedCapitalCase =
                {"Aydın'da", "Google'dan", "Google", "Şiirde", "Kışçığa", "Kış"};
        String[] expectedUpperRootLowerEndingCase =
                {"AYDIN'da", "GOOGLE'dan", "GOOGLE", "ŞİİRde", "KIŞçığa", "KIŞ"};

        testCaseType(morphology, inputs, expectedDefaultCase, WordAnalysisFormatter.CaseType.DEFAULT);
        testCaseType(morphology, inputs, expectedLowerCase, WordAnalysisFormatter.CaseType.LOWER_CASE);
        testCaseType(morphology, inputs, expectedUpperCase, WordAnalysisFormatter.CaseType.UPPER_CASE);
        testCaseType(morphology, inputs, expectedCapitalCase, WordAnalysisFormatter.CaseType.CAPITAL_CASE);
        testCaseType(morphology, inputs, expectedUpperRootLowerEndingCase,
                WordAnalysisFormatter.CaseType.UPPERCASE_ROOT_LOWER_CASE_ENDING);
    }

    private void testCaseType(
            TurkishMorphology morphology,
            String[] inputs,
            String[] expected,
            WordAnalysisFormatter.CaseType caseType) {

        WordAnalysisFormatter formatter = new WordAnalysisFormatter();

        int i = 0;
        for (String input : inputs) {
            List<WordAnalysis> results = morphology.analyze(input);
            for (WordAnalysis result : results) {
                Assert.assertEquals(expected[i], formatter.formatToCase(result, caseType));
            }
            i++;
        }
    }


}
