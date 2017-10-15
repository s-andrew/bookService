package tasks.bookService.data;

public class Word {
    private String language;
    private String value;

    public Word(String language, String value){
        this.language = language;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Word)) return false;
        Word o = (Word)obj;

        return value.equals(o.value) && language.equals(o.language);
    }
}
