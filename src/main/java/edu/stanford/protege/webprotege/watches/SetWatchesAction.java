package edu.stanford.protege.webprotege.watches;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.collect.ImmutableSet;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.common.UserId;
import org.semanticweb.owlapi.model.OWLEntity;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 29/02/16
 */
@JsonTypeName("webprotege.watches.SetWatches")
public record SetWatchesAction(ProjectId projectId, UserId userId, OWLEntity entity, ImmutableSet<Watch> watches) implements ProjectAction<SetWatchesResult> {

    public static final String CHANNEL = "webprotege.watches.SetWatches";

    @Override
    public String getChannel() {
        return CHANNEL;
    }

    public SetWatchesAction(ProjectId projectId, UserId userId, OWLEntity entity, ImmutableSet<Watch> watches) {
        this.projectId = checkNotNull(projectId);
        this.userId = checkNotNull(userId);
        this.entity = checkNotNull(entity);
        this.watches = checkNotNull(watches);
    }
}
