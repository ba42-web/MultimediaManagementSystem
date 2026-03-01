package view;

import model.Media;

public class MediaView {
    public void displayMediaDetails(Media media) {
        System.out.println("Media Info: ");
        System.out.println("File Name: " + media.getFileName());
        System.out.println("File Type: " + media.getFileType());
        System.out.println("File Size: " + media.getFileSize());
    }
}