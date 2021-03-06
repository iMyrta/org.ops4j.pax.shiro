/*
 * Copyright 2013 Harald Wellmann
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ops4j.pax.shiro.faces.tags;

import javax.faces.component.FacesComponent;

/**
 * Tag that renders the tag body only if the current user has executed a <b>successful</b> authentication attempt
 * <em>during their current session</em>.
 * <p/>
 * This is more restrictive than the {@link UserTag}, which only
 * ensures the current user is known to the system, either via a current login or from Remember Me services,
 * which only makes the assumption that the current user is who they say they are, and does not guarantee it like
 * this tag does.
 * <p/>
 * The logically opposite tag of this one is the {@link NotAuthenticatedTag}
 */
@FacesComponent("org.ops4j.pax.shiro.component.NotAuthenticated")
public class AuthenticatedComponent extends ShiroComponent {

    @Override
    public boolean isRendered() {
        return !isAuthenticated();
    }
}
