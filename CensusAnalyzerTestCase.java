import Census_Analyzer.CensusAnalyserException;
import Census_Analyzer.CensusAnalyzer;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CensusAnalyzerTestCase extends TestCase  {

            private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\Census_Analyzer\\src\\test\\java\\CensusAnalyzerTestCase.java";
            private static final String WRONG_CSV_FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\Census_Analyzer\\src\\test\\java\\IndiaStateCensusData.csv";

        @Test
        public void givenIndianCensusCSVFileReturnsCorrectRecords() {
            try {
                CensusAnalyzer censusAnalyser = new CensusAnalyzer();
                int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
                Assertions.assertEquals(29,numOfRecords);
            } catch (CensusAnalyserException e) { }
        }
    }

