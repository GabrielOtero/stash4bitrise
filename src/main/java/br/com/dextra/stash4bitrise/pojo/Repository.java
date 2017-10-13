package br.com.dextra.stash4bitrise.pojo;

public class Repository
{
    private String id;

    private Project project;

    private String scmId;

    private String forkable;

    private String name;

    private String state;

    private String slug;

    private String pub;

    private String statusMessage;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Project getProject ()
    {
        return project;
    }

    public void setProject (Project project)
    {
        this.project = project;
    }

    public String getScmId ()
    {
        return scmId;
    }

    public void setScmId (String scmId)
    {
        this.scmId = scmId;
    }

    public String getForkable ()
    {
        return forkable;
    }

    public void setForkable (String forkable)
    {
        this.forkable = forkable;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getSlug ()
    {
        return slug;
    }

    public void setSlug (String slug)
    {
        this.slug = slug;
    }

    public String getPublic ()
    {
        return pub;
    }

    public void setPublic (String pub)
    {
        this.pub = pub;
    }

    public String getStatusMessage ()
    {
        return statusMessage;
    }

    public void setStatusMessage (String statusMessage)
    {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", project = "+project+", scmId = "+scmId+", forkable = "+forkable+", name = "+name+", state = "+state+", slug = "+slug+", public = "+pub+", statusMessage = "+statusMessage+"]";
    }
}
