package com.microsoft.alm.distributedtask.webapi;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.xml.ws.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.distributedtask.webapi.model.JobEvent;
import com.microsoft.alm.distributedtask.webapi.model.TaskLog;
import com.microsoft.alm.distributedtask.webapi.model.TaskOrchestrationPlan;
import com.microsoft.alm.distributedtask.webapi.model.Timeline;
import com.microsoft.alm.distributedtask.webapi.model.TimelineRecord;
import com.microsoft.visualstudio.services.webapi.model.VssJsonCollectionWrapper;
import com.microsoft.alm.client.model.ApiResourceVersion;
import com.microsoft.alm.client.model.NameValueCollection;

public class TaskHttpClient
    extends TaskHttpClientBase
{

    public TaskHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }

    /**
     * @param records
     *
     * @param scopeIdentifier
     *            The project GUID to scope the request
     * @param hubName
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId
     *
     * @param timelineId
     *
     * @return List&lt;TimelineRecord&gt;
     */
    public List<TimelineRecord> updateRecords(
            final List<TimelineRecord> records,
            final UUID scopeIdentifier,
            final String hubName,
            final UUID planId,
            final UUID timelineId) {
        return super.updateRecords(VssJsonCollectionWrapper.newInstance(records), scopeIdentifier, hubName, planId, timelineId);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @return Response
     */
    public Timeline getTimeline(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId)
    {
        return super.getTimeline(scopeIdentifier, hubName, planId, timelineId, (Integer) null, (Boolean) null);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @param includeRecords
     * 
     * @return Response
     */
    public Timeline getTimeline(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId,
        final boolean includeRecords)
    {
        return super.getTimeline(scopeIdentifier, hubName, planId, timelineId, (Integer) null, includeRecords);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @param changeId
     * 
     * @return Response
     */
    public Timeline getTimeline(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId,
        final int changeId)
    {
        return super.getTimeline(scopeIdentifier, hubName, planId, timelineId, changeId, (Boolean) null);
    }

    /**
     * @param scopeIdentifier
     *        An UUID of the request scope, e.g. a Team Project ID
     * 
     * @param hubName
     *        Either "build" for Build2 hub or "rm" for Release Management hub
     * 
     * @param planId
     * 
     * @param timelineId
     * 
     * @return List&lt;TimelineRecord&gt;
     */
    public List<TimelineRecord> getRecords(
        final UUID scopeIdentifier,
        final String hubName,
        final UUID planId,
        final UUID timelineId)
    {
        return super.getRecords(scopeIdentifier, hubName, planId, timelineId, (Integer) null);
    }
}
