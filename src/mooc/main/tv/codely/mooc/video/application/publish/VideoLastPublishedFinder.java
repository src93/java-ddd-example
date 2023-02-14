package tv.codely.mooc.video.application.publish;
import tv.codely.mooc.video.domain.Video;
import tv.codely.mooc.video.domain.VideoRepository;

import java.util.Optional

public class VideoLastPublishedFinder {
    private final VideoRepository videoRepository;

    public VideoLastPublishedFinder(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Optional<Video> getLastVideoPublished {
        return videoRepository.getLastVideo();
    }
}
