package com.apress.gerber.reminders;

/**
 * Created by dan on 3/17/16.
 */
public class Reminder
{
    private int mId;
    private String mContent;
    private int mImportant;

    public Reminder(String content, int id, int important)
    {
        mContent = content;
        mId = id;
        mImportant = important;
    }

    public int getId()
    {
        return mId;
    }

    public void setId(int id)
    {
        mId = id;
    }

    public String getContent()
    {
        return mContent;
    }

    public void setContent(String content)
    {
        mContent = content;
    }

    public int getImportant()
    {
        return mImportant;
    }

    public void setImportant(int important)
    {
        mImportant = important;
    }
}
