package edu.stanford.protege.webprotege.issues;


import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 12 Oct 2016
 */
@JsonTypeName("webprotege.discussions.SetDiscussionThreadStatus")
public record SetDiscussionThreadStatusAction(@Nonnull ProjectId projectId,
                                             @Nonnull ThreadId threadId,
                                             @Nonnull Status status) implements ProjectAction<SetDiscussionThreadStatusResult> {

    public static final String CHANNEL = "webprotege.discussions.SetDiscussionThreadStatus";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
