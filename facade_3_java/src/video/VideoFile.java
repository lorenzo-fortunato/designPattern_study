package video;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name, String codecType) {
        this.name = name;
        this.codecType = codecType;
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
