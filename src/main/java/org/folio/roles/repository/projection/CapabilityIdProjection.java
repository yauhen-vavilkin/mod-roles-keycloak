package org.folio.roles.repository.projection;

import java.util.UUID;

/**
 * Projection for a capability row reduced to its identifier.
 */
public interface CapabilityIdProjection {

  /**
   * Returns the capability identifier.
   */
  UUID getId();
}
