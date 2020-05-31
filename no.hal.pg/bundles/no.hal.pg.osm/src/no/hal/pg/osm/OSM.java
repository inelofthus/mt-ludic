/**
 */
package no.hal.pg.osm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.osm.OSM#getNodes <em>Nodes</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getWays <em>Ways</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getRelations <em>Relations</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getBounds <em>Bounds</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getVersion <em>Version</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getGenerator <em>Generator</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getNotes <em>Notes</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link no.hal.pg.osm.OSM#getCopyright <em>Copyright</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.osm.OsmPackage#getOSM()
 * @model extendedMetaData="name='osm'"
 * @generated
 */
public interface OSM extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.osm.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="name='node' kind='element'"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Ways</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.osm.Way}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ways</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ways</em>' containment reference list.
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Ways()
	 * @model containment="true"
	 *        extendedMetaData="name='way' kind='element'"
	 * @generated
	 */
	EList<Way> getWays();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.osm.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Relations()
	 * @model containment="true"
	 *        extendedMetaData="name='relation' kind='element'"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Bounds()
	 * @model containment="true"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link no.hal.pg.osm.OSM#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link no.hal.pg.osm.OSM#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see #setGenerator(String)
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Generator()
	 * @model
	 * @generated
	 */
	String getGenerator();

	/**
	 * Sets the value of the '{@link no.hal.pg.osm.OSM#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.osm.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Notes()
	 * @model containment="true"
	 *        extendedMetaData="name='note' kind='element'"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.osm.MetaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' containment reference list.
	 * @see no.hal.pg.osm.OsmPackage#getOSM_MetaData()
	 * @model containment="true"
	 *        extendedMetaData="name='meta' kind='element'"
	 * @generated
	 */
	EList<MetaData> getMetaData();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' attribute.
	 * @see #setCopyright(String)
	 * @see no.hal.pg.osm.OsmPackage#getOSM_Copyright()
	 * @model
	 * @generated
	 */
	String getCopyright();

	/**
	 * Sets the value of the '{@link no.hal.pg.osm.OSM#getCopyright <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' attribute.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(String value);

} // OSM
