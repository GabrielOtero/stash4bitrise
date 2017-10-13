package br.com.dextra.stash4bitrise.pojo;

public class Changesets
{
    private String limit;

    private final ThreadLocal<Values[]> values = new ThreadLocal<>();

    private String isLastPage;

    private String start;

    private String size;

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public Values[] getValues ()
    {
        return values.get();
    }

    public void setValues (Values[] values)
    {
        this.values.set(values);
    }

    public String getIsLastPage ()
    {
        return isLastPage;
    }

    public void setIsLastPage (String isLastPage)
    {
        this.isLastPage = isLastPage;
    }

    public String getStart ()
    {
        return start;
    }

    public void setStart (String start)
    {
        this.start = start;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [limit = "+limit+", values = "+ values.get() +", isLastPage = "+isLastPage+", start = "+start+", size = "+size+"]";
    }
}
