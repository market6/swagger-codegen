package io.swagger.codegen.aspnetwebapi2;

import io.swagger.codegen.AbstractOptionsTest;
import io.swagger.codegen.CodegenConfig;
import io.swagger.codegen.languages.AspNetWebApi2ServerCodegen;
import io.swagger.codegen.options.AspNet5ServerOptionsProvider;
import io.swagger.codegen.options.AspNetWebAPi2ServerOptionsProvider;
import mockit.Expectations;
import mockit.Tested;

public class AspNetWebApi2ServerOptionsTest extends AbstractOptionsTest {

    @Tested
    private AspNetWebApi2ServerCodegen serverCodegen;

    public AspNetWebApi2ServerOptionsTest() {
        super(new AspNetWebAPi2ServerOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return serverCodegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        new Expectations(serverCodegen) {{
            serverCodegen.setPackageName(AspNetWebAPi2ServerOptionsProvider.PACKAGE_NAME_VALUE);
            times = 1;
            serverCodegen.setPackageVersion(AspNetWebAPi2ServerOptionsProvider.PACKAGE_VERSION_VALUE);
            times = 1;
            serverCodegen.setSourceFolder(AspNetWebAPi2ServerOptionsProvider.SOURCE_FOLDER_VALUE);
            times = 1;
            serverCodegen.useDateTimeOffset(true);
            times = 1;
            serverCodegen.setUseCollection(false);
            times = 1;
            serverCodegen.setReturnICollection(false);
            times = 1;
        }};
    }
}
