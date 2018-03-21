package main.stream.review.view;

import main.stream.review.model.Summary;

public class SummaryDisplayer {

    public void display(Summary summary) {

        // display 3 most rated recipies
        System.out.println("Top rated reviews:");
        summary.getTopRatedReviews()
                .forEach(review -> System.out.println(review));

        System.out.println(" ------ ");

        // display the most feedback appearing word
        System.out.println("Top feedback words: ");
        summary.getTopFeedbackWords()
                .forEach(word -> System.out.println(word));

    }

}
