
package io.javelit.core.helpers;


import java.util.List;

/**
 * Represents OAuth2 user claims.
 *
 * @param subject the subject (user identifier)
 * @param name the user's name
 * @param email the user's email
 * @param oid the user's OID
 * @param roles the user's roles
 * @param groups the user's groups
 */
public record OAuth2UserClaims(
    String subject,
    String name,
    String email,
    String oid,
    List<String> roles,
    List<String> groups
) {
    /**
     * Checks if the user has the specified role.
     * @param role the role to check
     * @return true if the user has the role, false otherwise
     */
    public boolean hasRole(String role) {
        return roles != null && roles.contains(role);
    }
}
