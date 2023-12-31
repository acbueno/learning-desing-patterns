package br.com.acbueno.learning.desing.patterns.structural.facade.video;

public class VideoFile {

    private String name;
    private String codeType;

    public VideoFile(String name) {
       this.name = name;
       this.codeType = name.substring(name.indexOf(".") +1);
    }

    public String getName() {
        return name;
    }

    public String getCodeType() {
        return codeType;
    }

}
