package controller;

import model.Media;
import view.MediaView;

public class MediaController {
    private Media media;
    private MediaView mediaView;

    public MediaController(Media media, MediaView mediaView) {
        this.media = media;
        this.mediaView = mediaView;
    }

    public void displayMediaInfo() {
        mediaView.displayMediaDetails(media);
    }
}