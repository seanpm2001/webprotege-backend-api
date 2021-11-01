package edu.stanford.protege.webprotege.obo;

import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.common.ProjectId;
import edu.stanford.protege.webprotege.dispatch.ProjectAction;
import org.semanticweb.owlapi.model.OWLEntity;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 22 Jun 2017
 */
@JsonTypeName("webprotege.obo.SetOboTermRelationships")
public record SetOboTermRelationshipsAction(ProjectId projectId,
                                            OWLEntity term,
                                            OBOTermRelationships relationships) implements ProjectAction<SetOboTermRelationshipsResult> {

    public static final String CHANNEL = "webprotege.obo.SetOboTermRelationships";

    @Override
    public String getChannel() {
        return CHANNEL;
    }
}

