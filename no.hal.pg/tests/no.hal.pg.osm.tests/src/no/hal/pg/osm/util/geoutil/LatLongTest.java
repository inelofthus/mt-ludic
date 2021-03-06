package no.hal.pg.osm.util.geoutil;

import org.junit.Assert;
import org.junit.Test;

import no.hal.pg.osm.geoutil.LatLong;

public class LatLongTest {

	@Test
	public void testLatLong() {
		LatLong latLong = new LatLong(Math.PI, Math.E);
		testPiE(latLong);
	}

	protected void testPiE(LatLong latLong) {
		Assert.assertEquals(Math.PI, latLong.latitude, 0.0);
		Assert.assertEquals(Math.E, latLong.longitude, 0.0);
	}

	@Test
	public void testValueOf() {
		LatLong latLong = LatLong.valueOf(Math.PI + ";" + Math.E, ";");
		testPiE(latLong);
	}
}
