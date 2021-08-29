package edu.stanford.protege.webprotege.issues;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 8 Oct 2016
 */


@JsonTypeName("UpdateComment")
public record UpdateCommentAction(@JsonProperty("projectId") @Nonnull ProjectId projectId,
                                  @JsonProperty("threadId") @Nonnull ThreadId threadId,
                                  @JsonProperty("commentId") @Nonnull CommentId commentId,
                                  @JsonProperty("body") @Nonnull String body) implements ProjectAction<UpdateCommentResult> {

    public static final String CHANNEL = "webprotege.discussions.UpdateComment";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
