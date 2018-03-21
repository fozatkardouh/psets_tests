package main.stream.review.controller;

import main.stream.review.model.Review;
import main.stream.review.model.Summary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Summarizer {

    public Summary summarize(List<Review> reviews) {

        // the 3 most rated recipies
        List<String> topRatedReviews = reviews.stream()
                .sorted((e1, e2) -> e2.getRating().compareTo(e1.getRating()))
                .limit(3)
                .map(e -> e.getRecipe() + " (" + e.getRating() + ")")
                .collect(Collectors.toList());

        // 2 feedback words that were used the most
        Map<String, Long> appearances = reviews.stream()
                .map(review -> review.getFeedback())
                .flatMap(feedback -> feedback.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));


        List<String> topFeedbackWords = appearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " " + e.getValue() + " times")
                .collect(Collectors.toList());

        Summary summary = new Summary();
        summary.setTopRatedReviews(topRatedReviews);
        summary.setTopFeedbackWords(topFeedbackWords);

        return summary;
    }

}
