package at.refugeescode.psets_tests.pset1;

import at.refugeescode.psets_tests.pset1.controller.MovieDatabaseSummarizer;
import at.refugeescode.psets_tests.pset1.model.Summary;
import at.refugeescode.psets_tests.pset1.view.SummaryDisplayer;

public class Pset1Main {

    public static void main(String[] args) {
        SummaryDisplayer displayer = new SummaryDisplayer();
        Summary summary = summarizer();
        // this part will only display the stuff
        displayer.display(summary);
    }

    public static Summary summarizer() {
        MovieDatabaseSummarizer summarizer = new MovieDatabaseSummarizer();
        // this part is going to do the logic
        // the result will be stored in the summary
        return summarizer.summarize();
    }

}
