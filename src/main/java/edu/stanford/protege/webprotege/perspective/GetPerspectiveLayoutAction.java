package edu.stanford.protege.webprotege.perspective;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import edu.stanford.protege.webprotege.project.HasProjectId;
import edu.stanford.protege.webprotege.common.UserId;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 17/02/16
 */
@JsonTypeName("webprotege.perspectives.GetPerspectiveLayout")
public record GetPerspectiveLayoutAction(ProjectId projectId, UserId userId, PerspectiveId perspectiveId) implements ProjectAction<GetPerspectiveLayoutResult>, HasProjectId {

    public static final String CHANNEL = "webprotege.perspectives.GetPerspectiveLayout";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}
