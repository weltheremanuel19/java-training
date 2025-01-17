package clean.code.design_patterns.requirements.prototype;
public class AfisPublicitar {
    private String text;
    private Logo logo;

    public AfisPublicitar(String text, Logo logo) {
        this.text = text;
        this.logo = logo;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }
}

