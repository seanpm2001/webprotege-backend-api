package edu.stanford.protege.webprotege.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.Request;
import edu.stanford.protege.webprotege.dispatch.Action;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 21/02/15
 */
@JsonTypeName("webprotege.projects.CreateNewProject")
public record CreateNewProjectAction(NewProjectSettings newProjectSettings) implements Action<CreateNewProjectResult>, Request<CreateNewProjectResult> {

    public static final String CHANNEL = "webprotege.projects.CreateNewProject";

    @Override
    public String getChannel() {
        return CHANNEL;
    }

    @JsonCreator
    public CreateNewProjectAction(@JsonProperty("newProjectSettings") NewProjectSettings newProjectSettings) {
        this.newProjectSettings = checkNotNull(newProjectSettings);
    }

    public static CreateNewProjectAction create(NewProjectSettings newProjectSettings) {
        return new CreateNewProjectAction(newProjectSettings);
    }
}
