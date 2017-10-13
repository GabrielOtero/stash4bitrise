package br.com.dextra.stash4bitrise.pojo;

public class Values
{
    private String srcExecutable;

    private String fromContentId;

    private Link link;

    private String percentUnchanged;

    private String executable;

    private Path path;

    private Links links;

    private String nodeType;

    private String type;

    private String contentId;

    public String getSrcExecutable ()
    {
        return srcExecutable;
    }

    public void setSrcExecutable (String srcExecutable)
    {
        this.srcExecutable = srcExecutable;
    }

    public String getFromContentId ()
    {
        return fromContentId;
    }

    public void setFromContentId (String fromContentId)
    {
        this.fromContentId = fromContentId;
    }

    public Link getLink ()
    {
        return link;
    }

    public void setLink (Link link)
    {
        this.link = link;
    }

    public String getPercentUnchanged ()
    {
        return percentUnchanged;
    }

    public void setPercentUnchanged (String percentUnchanged)
    {
        this.percentUnchanged = percentUnchanged;
    }

    public String getExecutable ()
    {
        return executable;
    }

    public void setExecutable (String executable)
    {
        this.executable = executable;
    }

    public Path getPath ()
    {
        return path;
    }

    public void setPath (Path path)
    {
        this.path = path;
    }

    public Links getLinks ()
    {
        return links;
    }

    public void setLinks (Links links)
    {
        this.links = links;
    }

    public String getNodeType ()
    {
        return nodeType;
    }

    public void setNodeType (String nodeType)
    {
        this.nodeType = nodeType;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getContentId ()
    {
        return contentId;
    }

    public void setContentId (String contentId)
    {
        this.contentId = contentId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [srcExecutable = "+srcExecutable+", fromContentId = "+fromContentId+", link = "+link+", percentUnchanged = "+percentUnchanged+", executable = "+executable+", path = "+path+", links = "+links+", nodeType = "+nodeType+", type = "+type+", contentId = "+contentId+"]";
    }
}