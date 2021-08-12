package edu.stanford.protege.webprotege.form;

import com.google.common.collect.ImmutableList;
import edu.stanford.protege.webprotege.dispatch.Action;
import edu.stanford.protege.webprotege.dispatch.Result;
import edu.stanford.protege.webprotege.match.JsonSerializationTestUtil;
import edu.stanford.protege.webprotege.criteria.CompositeRootCriteria;
import edu.stanford.protege.webprotege.criteria.MultiMatchType;
import edu.stanford.protege.webprotege.common.ProjectId;
import org.junit.Test;

import java.io.IOException;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-04-07
 */
public class GetEntityFormDescriptor_Serialization_TestCase {


    @Test
    public void shouldSerializeAction() throws IOException {
        var action = new GetEntityFormDescriptorAction(ProjectId.generate(),
                                                          FormId.generate());
        JsonSerializationTestUtil.testSerialization(action, Action.class);
    }

    @Test
    public void shouldSerializeResult() throws IOException {
        var result = new GetEntityFormDescriptorResult(ProjectId.generate(),
                                                       FormId.generate(),
                                                       FormDescriptor.empty(FormId.generate()),
                                                       FormPurpose.ENTITY_DEPRECATION,
                                                       CompositeRootCriteria.get(ImmutableList.of(), MultiMatchType.ALL));
        JsonSerializationTestUtil.testSerialization(result, Result.class);
    }

}
