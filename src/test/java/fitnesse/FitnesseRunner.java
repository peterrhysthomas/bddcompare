package fitnesse;

import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("SwiftMappings")
@FitNesseRunner.FitnesseDir("/Users/peter/dev/source/bddcompare/fitnesse")
@FitNesseRunner.OutputDir("./build/fitnesse-results")
public class FitnesseRunner {
}