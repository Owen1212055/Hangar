package io.papermc.hangar.model.internal.api.requests;

import io.papermc.hangar.model.common.NamedPermission;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;

public class CreateAPIKeyForm {

    @Schema(minimum = "5", maximum = "255", requiredMode = Schema.RequiredMode.REQUIRED)
    private final @NotBlank @Size(min = 5, max = 255) String name;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
    private final @Size(min = 1) List<NamedPermission> permissions;

    public CreateAPIKeyForm(final String name, final List<NamedPermission> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return this.name;
    }

    public List<NamedPermission> getPermissions() {
        return this.permissions;
    }

    @Override
    public String toString() {
        return "CreateAPIKeyForm{" +
            "name='" + this.name + '\'' +
            ", permissions=" + this.permissions +
            '}';
    }
}
