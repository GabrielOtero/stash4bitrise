package br.com.dextra.stash4bitrise.pojo;

public class Link
{
    private String rel;

    private String url;

    public String getRel ()
    {
        return rel;
    }

    public void setRel (String rel)
    {
        this.rel = rel;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rel = "+rel+", url = "+url+"]";
    }
}
