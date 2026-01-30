
package io.javelit.core.helpers;

/**
 * Represents an OAuth2 token response.
 *
 * @param accessToken the access token
 * @param idToken the ID token
 * @param refreshToken the refresh token
 * @param expiresIn the number of seconds until expiration
 */
public record OAuth2TokenResponse(
    String accessToken,
    String idToken,
    String refreshToken,
    int expiresIn
) {}
