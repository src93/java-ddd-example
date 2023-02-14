package tv.codely.mooc.video.application.publish;

import tv.codely.mooc.video.domain.Video;
import tv.codely.mooc.video.domain.VideoRepository;

public class VideoRepositorySave {
    private final VideoRepository videoRepository;

    public VideoRepositorySave(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public void save(Video video) {
        videoRepository.save(video);
    }
}
