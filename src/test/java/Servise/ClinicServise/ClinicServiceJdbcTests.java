
package org.springframework.samples.petclinic.service.clinicService;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * <p> Integration test using the jdbc profile.
 *
 * @author Thomas Risberg
 * @author Michael Isvy
 * @see AbstractClinicServiceTests AbstractClinicServiceTests for more details. </p>
 */
@SpringBootTest
@ActiveProfiles({"jdbc", "hsqldb"})
class ClinicServiceJdbcTests extends AbstractClinicServiceTests {

}
