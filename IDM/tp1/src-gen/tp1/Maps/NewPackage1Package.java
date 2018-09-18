/**
 */
package tp1.Maps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tp1.Maps.NewPackage1Factory
 * @model kind="package"
 * @generated
 */
public interface NewPackage1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Maps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "tp1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage1Package eINSTANCE = tp1.Maps.impl.NewPackage1PackageImpl.init();

	/**
	 * The meta object id for the '{@link tp1.Maps.impl.mapImpl <em>map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp1.Maps.impl.mapImpl
	 * @see tp1.Maps.impl.NewPackage1PackageImpl#getmap()
	 * @generated
	 */
	int MAP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Roads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROADS = 1;

	/**
	 * The feature id for the '<em><b>Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SPACES = 2;

	/**
	 * The number of structural features of the '<em>map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tp1.Maps.impl.PublicSpaceImpl <em>Public Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp1.Maps.impl.PublicSpaceImpl
	 * @see tp1.Maps.impl.NewPackage1PackageImpl#getPublicSpace()
	 * @generated
	 */
	int PUBLIC_SPACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE__BORDERED_BY = 1;

	/**
	 * The number of structural features of the '<em>Public Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Public Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tp1.Maps.impl.RoadImpl <em>Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp1.Maps.impl.RoadImpl
	 * @see tp1.Maps.impl.NewPackage1PackageImpl#getRoad()
	 * @generated
	 */
	int ROAD = 2;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__BORDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__LENGTH = 2;

	/**
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tp1.Maps.impl.StreetImpl <em>Street</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp1.Maps.impl.StreetImpl
	 * @see tp1.Maps.impl.NewPackage1PackageImpl#getStreet()
	 * @generated
	 */
	int STREET = 3;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__BORDER = ROAD__BORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__NAME = ROAD__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LENGTH = ROAD__LENGTH;

	/**
	 * The number of structural features of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tp1.Maps.impl.PedestrianImpl <em>Pedestrian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp1.Maps.impl.PedestrianImpl
	 * @see tp1.Maps.impl.NewPackage1PackageImpl#getPedestrian()
	 * @generated
	 */
	int PEDESTRIAN = 4;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__BORDER = ROAD__BORDER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__NAME = ROAD__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__LENGTH = ROAD__LENGTH;

	/**
	 * The number of structural features of the '<em>Pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tp1.Maps.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp1.Maps.impl.SquareImpl
	 * @see tp1.Maps.impl.NewPackage1PackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NAME = PUBLIC_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BORDERED_BY = PUBLIC_SPACE__BORDERED_BY;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = PUBLIC_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = PUBLIC_SPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tp1.Maps.impl.GardenImpl <em>Garden</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp1.Maps.impl.GardenImpl
	 * @see tp1.Maps.impl.NewPackage1PackageImpl#getGarden()
	 * @generated
	 */
	int GARDEN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN__NAME = PUBLIC_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN__BORDERED_BY = PUBLIC_SPACE__BORDERED_BY;

	/**
	 * The number of structural features of the '<em>Garden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN_FEATURE_COUNT = PUBLIC_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Garden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN_OPERATION_COUNT = PUBLIC_SPACE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link tp1.Maps.map <em>map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>map</em>'.
	 * @see tp1.Maps.map
	 * @generated
	 */
	EClass getmap();

	/**
	 * Returns the meta object for the attribute '{@link tp1.Maps.map#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp1.Maps.map#getName()
	 * @see #getmap()
	 * @generated
	 */
	EAttribute getmap_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tp1.Maps.map#getRoads <em>Roads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roads</em>'.
	 * @see tp1.Maps.map#getRoads()
	 * @see #getmap()
	 * @generated
	 */
	EReference getmap_Roads();

	/**
	 * Returns the meta object for the containment reference list '{@link tp1.Maps.map#getSpaces <em>Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spaces</em>'.
	 * @see tp1.Maps.map#getSpaces()
	 * @see #getmap()
	 * @generated
	 */
	EReference getmap_Spaces();

	/**
	 * Returns the meta object for class '{@link tp1.Maps.PublicSpace <em>Public Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Space</em>'.
	 * @see tp1.Maps.PublicSpace
	 * @generated
	 */
	EClass getPublicSpace();

	/**
	 * Returns the meta object for the attribute '{@link tp1.Maps.PublicSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp1.Maps.PublicSpace#getName()
	 * @see #getPublicSpace()
	 * @generated
	 */
	EAttribute getPublicSpace_Name();

	/**
	 * Returns the meta object for the reference list '{@link tp1.Maps.PublicSpace#getBorderedBy <em>Bordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bordered By</em>'.
	 * @see tp1.Maps.PublicSpace#getBorderedBy()
	 * @see #getPublicSpace()
	 * @generated
	 */
	EReference getPublicSpace_BorderedBy();

	/**
	 * Returns the meta object for class '{@link tp1.Maps.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road</em>'.
	 * @see tp1.Maps.Road
	 * @generated
	 */
	EClass getRoad();

	/**
	 * Returns the meta object for the reference list '{@link tp1.Maps.Road#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Border</em>'.
	 * @see tp1.Maps.Road#getBorder()
	 * @see #getRoad()
	 * @generated
	 */
	EReference getRoad_Border();

	/**
	 * Returns the meta object for the attribute '{@link tp1.Maps.Road#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp1.Maps.Road#getName()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Name();

	/**
	 * Returns the meta object for the attribute '{@link tp1.Maps.Road#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see tp1.Maps.Road#getLength()
	 * @see #getRoad()
	 * @generated
	 */
	EAttribute getRoad_Length();

	/**
	 * Returns the meta object for class '{@link tp1.Maps.Street <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street</em>'.
	 * @see tp1.Maps.Street
	 * @generated
	 */
	EClass getStreet();

	/**
	 * Returns the meta object for class '{@link tp1.Maps.Pedestrian <em>Pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pedestrian</em>'.
	 * @see tp1.Maps.Pedestrian
	 * @generated
	 */
	EClass getPedestrian();

	/**
	 * Returns the meta object for class '{@link tp1.Maps.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see tp1.Maps.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for class '{@link tp1.Maps.Garden <em>Garden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Garden</em>'.
	 * @see tp1.Maps.Garden
	 * @generated
	 */
	EClass getGarden();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NewPackage1Factory getNewPackage1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tp1.Maps.impl.mapImpl <em>map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp1.Maps.impl.mapImpl
		 * @see tp1.Maps.impl.NewPackage1PackageImpl#getmap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getmap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__NAME = eINSTANCE.getmap_Name();

		/**
		 * The meta object literal for the '<em><b>Roads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ROADS = eINSTANCE.getmap_Roads();

		/**
		 * The meta object literal for the '<em><b>Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__SPACES = eINSTANCE.getmap_Spaces();

		/**
		 * The meta object literal for the '{@link tp1.Maps.impl.PublicSpaceImpl <em>Public Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp1.Maps.impl.PublicSpaceImpl
		 * @see tp1.Maps.impl.NewPackage1PackageImpl#getPublicSpace()
		 * @generated
		 */
		EClass PUBLIC_SPACE = eINSTANCE.getPublicSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SPACE__NAME = eINSTANCE.getPublicSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Bordered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_SPACE__BORDERED_BY = eINSTANCE.getPublicSpace_BorderedBy();

		/**
		 * The meta object literal for the '{@link tp1.Maps.impl.RoadImpl <em>Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp1.Maps.impl.RoadImpl
		 * @see tp1.Maps.impl.NewPackage1PackageImpl#getRoad()
		 * @generated
		 */
		EClass ROAD = eINSTANCE.getRoad();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__BORDER = eINSTANCE.getRoad_Border();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__NAME = eINSTANCE.getRoad_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__LENGTH = eINSTANCE.getRoad_Length();

		/**
		 * The meta object literal for the '{@link tp1.Maps.impl.StreetImpl <em>Street</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp1.Maps.impl.StreetImpl
		 * @see tp1.Maps.impl.NewPackage1PackageImpl#getStreet()
		 * @generated
		 */
		EClass STREET = eINSTANCE.getStreet();

		/**
		 * The meta object literal for the '{@link tp1.Maps.impl.PedestrianImpl <em>Pedestrian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp1.Maps.impl.PedestrianImpl
		 * @see tp1.Maps.impl.NewPackage1PackageImpl#getPedestrian()
		 * @generated
		 */
		EClass PEDESTRIAN = eINSTANCE.getPedestrian();

		/**
		 * The meta object literal for the '{@link tp1.Maps.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp1.Maps.impl.SquareImpl
		 * @see tp1.Maps.impl.NewPackage1PackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '{@link tp1.Maps.impl.GardenImpl <em>Garden</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp1.Maps.impl.GardenImpl
		 * @see tp1.Maps.impl.NewPackage1PackageImpl#getGarden()
		 * @generated
		 */
		EClass GARDEN = eINSTANCE.getGarden();

	}

} //NewPackage1Package
