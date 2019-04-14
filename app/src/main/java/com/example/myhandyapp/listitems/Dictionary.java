package com.example.myhandyapp.listitems;

// Dictionary class
public class Dictionary extends ListItem {

    private long id;
    private String entryNumber;
    private String word;
    private String partOfSpeech;
    private String pronounciation;
    private String definitions;

    public Dictionary() { }

    public String getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(String entryNumber) {
        this.entryNumber = entryNumber;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getPronounciation() {
        return pronounciation;
    }

    public void setPronounciation(String pronounciation) {
        this.pronounciation = pronounciation;
    }

    public String getDefinitions() {
        return definitions;
    }

    public void setDefinitions(String definitions) {
        this.definitions = definitions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
