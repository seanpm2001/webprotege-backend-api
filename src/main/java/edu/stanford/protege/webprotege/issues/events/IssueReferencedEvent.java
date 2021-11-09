package edu.stanford.protege.webprotege.issues.events;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.base.Objects;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.common.UserId;

import javax.annotation.Nonnull;

import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 26 Sep 16
 */
@JsonTypeName("IssueReferencedEvent")
public record IssueReferencedEvent(@Nonnull ProjectId projectId, @Nonnull UserId userId,
                                   long timestamp,
                                   int issueNumber, int referencedByIssueNumber) implements IssueEvent {

    public static final String CHANNEL = "webprotege.issues.event.IssueReferenced";

    @Override
    public String getChannel() {
        return CHANNEL;
    }

    public IssueReferencedEvent(@Nonnull ProjectId projectId,
                                @Nonnull UserId userId,
                                long timestamp,
                                int issueNumber,
                                int referencedByIssueNumber) {
        this.projectId = checkNotNull(projectId);
        this.userId = checkNotNull(userId);
        this.timestamp = timestamp;
        this.issueNumber = issueNumber;
        this.referencedByIssueNumber = referencedByIssueNumber;
    }
}
