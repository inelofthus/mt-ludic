/**
 */
package no.hal.pg.osm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import no.hal.pg.osm.Bounds;
import no.hal.pg.osm.GeoLatLong;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.Member;
import no.hal.pg.osm.MetaData;
import no.hal.pg.osm.Node;
import no.hal.pg.osm.NodeRef;
import no.hal.pg.osm.Note;
import no.hal.pg.osm.OSM;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.OsmPackage;
import no.hal.pg.osm.Relation;
import no.hal.pg.osm.Tag;
import no.hal.pg.osm.Tags;
import no.hal.pg.osm.Way;
import no.hal.pg.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsmFactoryImpl extends EFactoryImpl implements OsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsmFactory init() {
		try {
			OsmFactory theOsmFactory = (OsmFactory)EPackage.Registry.INSTANCE.getEFactory(OsmPackage.eNS_URI);
			if (theOsmFactory != null) {
				return theOsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OsmPackage.NODE: return createNode();
			case OsmPackage.GEO_LOCATION: return createGeoLocation();
			case OsmPackage.GEO_LAT_LONG: return createGeoLatLong();
			case OsmPackage.WAY: return createWay();
			case OsmPackage.NODE_REF: return createNodeRef();
			case OsmPackage.TAGS: return createTags();
			case OsmPackage.TAG: return createTag();
			case OsmPackage.RELATION: return createRelation();
			case OsmPackage.MEMBER: return createMember();
			case OsmPackage.BOUNDS: return createBounds();
			case OsmPackage.OSM: return createOSM();
			case OsmPackage.NOTE: return createNote();
			case OsmPackage.META_DATA: return createMetaData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OsmPackage.LAT_LONG:
				return createLatLongFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OsmPackage.LAT_LONG:
				return convertLatLongToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoLocation createGeoLocation() {
		GeoLocationImpl geoLocation = new GeoLocationImpl();
		return geoLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLatLong createGeoLatLong() {
		GeoLatLongImpl geoLatLong = new GeoLatLongImpl();
		return geoLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Way createWay() {
		WayImpl way = new WayImpl();
		return way;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeRef createNodeRef() {
		NodeRefImpl nodeRef = new NodeRefImpl();
		return nodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bounds createBounds() {
		BoundsImpl bounds = new BoundsImpl();
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OSM createOSM() {
		OSMImpl osm = new OSMImpl();
		return osm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LatLong createLatLongFromString(EDataType eDataType, String initialValue) {
		return LatLong.valueOf(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatLongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsmPackage getOsmPackage() {
		return (OsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsmPackage getPackage() {
		return OsmPackage.eINSTANCE;
	}

} //OsmFactoryImpl
