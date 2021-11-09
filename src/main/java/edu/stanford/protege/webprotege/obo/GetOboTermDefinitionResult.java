package edu.stanford.protege.webprotege.obo;


import com.fasterxml.jackson.annotation.JsonTypeName;
import edu.stanford.protege.webprotege.dispatch.Result;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 21 Jun 2017
 */
@JsonTypeName("webprotege.obo.GetOboTermDefinition")
public record GetOboTermDefinitionResult(OBOTermDefinition definition) implements Result {

    public GetOboTermDefinitionResult(OBOTermDefinition definition) {
        this.definition = checkNotNull(definition);
    }
}
