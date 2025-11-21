package com.example.record.review.dto.response;

import com.example.record.review.entity.Ticket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketResponse {
    private Long id;
    private String userId;
    private String performanceTitle;
    private String theater;
    private String posterUrl;
    private String genre;
    private LocalDate viewDate;
    private String imageUrl;
    private String imagePrompt;
    private String reviewText;
    private Boolean isPublic;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public static TicketResponse from(Ticket ticket) {
        return TicketResponse.builder()
                .id(ticket.getId())
                .userId(ticket.getUser().getId())
                .performanceTitle(ticket.getPerformanceTitle())
                .theater(ticket.getTheater())
                .posterUrl(ticket.getPosterUrl())
                .genre(ticket.getGenre())
                .viewDate(ticket.getViewDate())
                .imageUrl(ticket.getImageUrl())
                .imagePrompt(ticket.getImagePrompt())
                .reviewText(ticket.getReviewText())
                .isPublic(ticket.getIsPublic())
                .createdAt(ticket.getCreatedAt())
                .updatedAt(ticket.getUpdatedAt())
                .build();
    }
}

