/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.sourcecontrol.webapi.model;

import java.util.List;

/** 
 */
public class HistoryQueryResults<T> {

    /**
    * True if there are more results available to fetch (we&#039;re returning the max # of items requested) A more RESTy solution would be to include a Link header
    */
    private boolean moreResultsAvailable;
    /**
    * The history entries (results) from this query
    */
    private List<HistoryEntry<T>> results;

    /**
    * True if there are more results available to fetch (we&amp;#039;re returning the max # of items requested) A more RESTy solution would be to include a Link header
    */
    public boolean getMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
    * True if there are more results available to fetch (we&amp;#039;re returning the max # of items requested) A more RESTy solution would be to include a Link header
    */
    public void setMoreResultsAvailable(final boolean moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    /**
    * The history entries (results) from this query
    */
    public List<HistoryEntry<T>> getResults() {
        return results;
    }

    /**
    * The history entries (results) from this query
    */
    public void setResults(final List<HistoryEntry<T>> results) {
        this.results = results;
    }
}
