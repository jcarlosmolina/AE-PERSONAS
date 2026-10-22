package com.keralty.aepersonas.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.aepersonas.exception.IntegrityConstraintException;
import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.global.Constants;
import com.keralty.aepersonas.global.PlantillaReporteConstants;
import com.keralty.aepersonas.persistence.oid.PlantillaReporteOid;
import com.keralty.aepersonas.persistence.oid.ReportesDominioOid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Persistent representation of the <code>PlantillaReporte</code> model class.
 * <p>
 * Model Class: <code>PlantillaReporte</code><br>
 */
@Entity(name = PlantillaReporteConstants.CLASS_NAME)
@Table(name = PlantillaReporteConstants.TBL_NAME)
public class PlantillaReporte extends AbstractAppEntity {
    @JsonIgnore
    private static final long serialVersionUID = 1L;

    /** Class identification function. */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PlantillaReporte_Sequence")
    @SequenceGenerator(name="PlantillaReporte_Sequence", sequenceName="PlantillaReporte_Sequence", allocationSize=1)
    @Column(name = PlantillaReporteConstants.FLD_PLANTILLAREPORTEIDPLANTILLAREPORTE )
    @JsonProperty(value="id_plantillareporte")
    private Long plantillaReporteidPlantillaReporte;

    /** Class member attribute. */
    @Column(name = PlantillaReporteConstants.FLD_PLANTILLAREPORTETIPO )
    @JsonProperty(value="tipo")
    private Long plantillaReporteTipo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaReporteTipo;

    /** Class member attribute. */
    @Column(name = PlantillaReporteConstants.FLD_PLANTILLAREPORTETITULO )
    @JsonProperty(value="titulo")
    private String plantillaReporteTitulo;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaReporteTitulo;

    /** Class member attribute. */
    @Column(name = PlantillaReporteConstants.FLD_PLANTILLAREPORTEFECHAVIGENCIA )
    @JsonProperty(value="fechavigencia")
    private Date plantillaReporteFechaVigencia;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaReporteFechaVigencia;

    /** Class member attribute. */
    @Column(name = PlantillaReporteConstants.FLD_PLANTILLAREPORTERUTAARCHIVOS )
    @JsonProperty(value="rutaarchivos")
    private String plantillaReporteRutaArchivos;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaReporteRutaArchivos;

    /** Class member attribute. */
    @Column(name = PlantillaReporteConstants.FLD_PLANTILLAREPORTENOMBREARCHIVOPDF )
    @JsonProperty(value="nombrearchivopdf")
    private String plantillaReporteNombreArchivoPDF;

    /** Class member attribute modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedPlantillaReporteNombreArchivoPDF;

    /** Related Class. */
    @OneToMany(mappedBy = PlantillaReporteConstants.ROLE_INVNAME_REPORTESDOMINIO)
    @JsonIgnore
    private Collection <ReportesDominio> reportesDominio;
    /** Related Class modified. */
    @Transient
    @JsonIgnore
    private boolean modifiedReportesDominio;

    /** Class related values.*/
    @Transient
    @JsonIgnore
    private transient Map<String, Object> values;

   /**
    * Default constructor
    */
    public PlantillaReporte() {
        plantillaReporteidPlantillaReporte = null;
        initAttributes();
    }

    /**
     * Constructor used to create instances of <code>PlantillaReporte</code>.
     * @param oid Object Identifier of the instance of <code>PlantillaReporte</code> to be created.
     * @throws SystemException
     */
    public PlantillaReporte(PlantillaReporteOid oid) {
        if (oid == null || oid.isNull()) {
            initAttributes();
        } else {
            plantillaReporteidPlantillaReporte = oid.getPlantillaReporteidPlantillaReporte();
            initAttributes();
        }
    }

    /**
     * Returns the value of the <code>plantillaReporteidPlantillaReporte</code> attribute<br>in class <code>PlantillaReporte</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PlantillaReporte</code>
     * @return The value of the <code>plantillaReporteidPlantillaReporte</code> attribute<br>in class <code>PlantillaReporte</code>.
     */
    public Long getPlantillaReporteidPlantillaReporte() {
        return plantillaReporteidPlantillaReporte;
    }

    /**
     * Sets the value of the <code>plantillaReporteidPlantillaReporte</code> attribute<br>in class <code>PlantillaReporte</code>.
     * This is part of the identification for this class, which depends on the identification of <code>PlantillaReporte</code>
     * @param plantillaReporteidPlantillaReporte The new value of the <code>plantillaReporteidPlantillaReporte</code> attribute<br>in class <code>PlantillaReporte</code>.
     */
    public void setPlantillaReporteidPlantillaReporte(Long plantillaReporteidPlantillaReporte) {
        this.plantillaReporteidPlantillaReporte = plantillaReporteidPlantillaReporte;
    }

   /**
    * Returns the value of the <code>plantillaReporteTipo</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteTipo</code>. Constant Nat<br>
    * Comments: -	Tipo de reporte: Indica para qué se utiliza, los valores posibles son: Solicitud, Contrato, Carnets, Carta preexistencias, Carta entrevista médica, Protección de datos, BB Gestante, Anexo inclusión, Maternidad, Neonatal, Cuestionario médico, Diferencias de liquidación y Novedad.<br>
    * @return The value of the <code>plantillaReporteTipo</code> attribute.
    */

    public Long getPlantillaReporteTipo()  {
    	Long value;
        value =  plantillaReporteTipo;
        return value;
    }

   /**
    * Sets the value of the <code>plantillaReporteTipo</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteTipo</code>. Constant Nat<br>
    * Comments: -	Tipo de reporte: Indica para qué se utiliza, los valores posibles son: Solicitud, Contrato, Carnets, Carta preexistencias, Carta entrevista médica, Protección de datos, BB Gestante, Anexo inclusión, Maternidad, Neonatal, Cuestionario médico, Diferencias de liquidación y Novedad.<br>
    * @param plantillaReporteTipo The new value of the <code>plantillaReporteTipo</code> attribute.
    */
    public void setPlantillaReporteTipo (Long plantillaReporteTipo) {
        modifiedPlantillaReporteTipo = true;
        this.plantillaReporteTipo = plantillaReporteTipo;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaReporteTipo</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaReporteTipo</code>.
    */
    public void setModifiedPlantillaReporteTipo(boolean modified) {
        this.modifiedPlantillaReporteTipo = modified;
    }

   /**
    * Returns the value of the <code>plantillaReporteTitulo</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteTitulo</code>. Variable String Size=100<br>
    * Comments: <br>
    * @return The value of the <code>plantillaReporteTitulo</code> attribute.
    */

    public String getPlantillaReporteTitulo()  {
    	String value;
        value =  plantillaReporteTitulo;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>plantillaReporteTitulo</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteTitulo</code>. Variable String Size=100<br>
    * Comments: <br>
    * @param plantillaReporteTitulo The new value of the <code>plantillaReporteTitulo</code> attribute.
    */
    public void setPlantillaReporteTitulo (String plantillaReporteTitulo) {
        modifiedPlantillaReporteTitulo = true;
        this.plantillaReporteTitulo = plantillaReporteTitulo;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaReporteTitulo</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaReporteTitulo</code>.
    */
    public void setModifiedPlantillaReporteTitulo(boolean modified) {
        this.modifiedPlantillaReporteTitulo = modified;
    }

   /**
    * Returns the value of the <code>plantillaReporteFechaVigencia</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteFechaVigencia</code>. Variable Date<br>
    * Comments: Fecha hora a partir de la cual debe utilizarse el reporte. <br>
    * @return The value of the <code>plantillaReporteFechaVigencia</code> attribute.
    */

    public Date getPlantillaReporteFechaVigencia()  {
    	Date value;
        value =  plantillaReporteFechaVigencia;
        return value;
    }

   /**
    * Sets the value of the <code>plantillaReporteFechaVigencia</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteFechaVigencia</code>. Variable Date<br>
    * Comments: Fecha hora a partir de la cual debe utilizarse el reporte. <br>
    * @param plantillaReporteFechaVigencia The new value of the <code>plantillaReporteFechaVigencia</code> attribute.
    */
    public void setPlantillaReporteFechaVigencia (Date plantillaReporteFechaVigencia) {
        modifiedPlantillaReporteFechaVigencia = true;
        this.plantillaReporteFechaVigencia = plantillaReporteFechaVigencia;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaReporteFechaVigencia</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaReporteFechaVigencia</code>.
    */
    public void setModifiedPlantillaReporteFechaVigencia(boolean modified) {
        this.modifiedPlantillaReporteFechaVigencia = modified;
    }

   /**
    * Returns the value of the <code>plantillaReporteRutaArchivos</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteRutaArchivos</code>. Variable String Size=255<br>
    * Comments: Camino parcial de carpetas, a partir de la indicada en el fichero de propiedades bajo la clave PATH_PLANTILLAS_REPORTS. En esa ubicación deberán encontrarse los archivos de las plantillas del reporte.<br>
    * @return The value of the <code>plantillaReporteRutaArchivos</code> attribute.
    */

    public String getPlantillaReporteRutaArchivos()  {
    	String value;
        value =  plantillaReporteRutaArchivos;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>plantillaReporteRutaArchivos</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteRutaArchivos</code>. Variable String Size=255<br>
    * Comments: Camino parcial de carpetas, a partir de la indicada en el fichero de propiedades bajo la clave PATH_PLANTILLAS_REPORTS. En esa ubicación deberán encontrarse los archivos de las plantillas del reporte.<br>
    * @param plantillaReporteRutaArchivos The new value of the <code>plantillaReporteRutaArchivos</code> attribute.
    */
    public void setPlantillaReporteRutaArchivos (String plantillaReporteRutaArchivos) {
        modifiedPlantillaReporteRutaArchivos = true;
        this.plantillaReporteRutaArchivos = plantillaReporteRutaArchivos;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaReporteRutaArchivos</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaReporteRutaArchivos</code>.
    */
    public void setModifiedPlantillaReporteRutaArchivos(boolean modified) {
        this.modifiedPlantillaReporteRutaArchivos = modified;
    }

   /**
    * Returns the value of the <code>plantillaReporteNombreArchivoPDF</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteNombreArchivoPDF</code>. Variable String Size=50<br>
    * Comments: <br>
    * @return The value of the <code>plantillaReporteNombreArchivoPDF</code> attribute.
    */

    public String getPlantillaReporteNombreArchivoPDF()  {
    	String value;
        value =  plantillaReporteNombreArchivoPDF;
        return (value == null ? null : value.trim());
    }

   /**
    * Sets the value of the <code>plantillaReporteNombreArchivoPDF</code> attribute.<br>
    * Model Attribute: <code>plantillaReporteNombreArchivoPDF</code>. Variable String Size=50<br>
    * Comments: <br>
    * @param plantillaReporteNombreArchivoPDF The new value of the <code>plantillaReporteNombreArchivoPDF</code> attribute.
    */
    public void setPlantillaReporteNombreArchivoPDF (String plantillaReporteNombreArchivoPDF) {
        modifiedPlantillaReporteNombreArchivoPDF = true;
        this.plantillaReporteNombreArchivoPDF = plantillaReporteNombreArchivoPDF;
    }

   /**
    * Sets the value of the <code>modifiedPlantillaReporteNombreArchivoPDF</code> class property.<br>
    * @param modified The new value of the <code>modifiedPlantillaReporteNombreArchivoPDF</code>.
    */
    public void setModifiedPlantillaReporteNombreArchivoPDF(boolean modified) {
        this.modifiedPlantillaReporteNombreArchivoPDF = modified;
    }

    /**
     * Returns the instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * Model Relationship:
     * <code>[ReportesDominio] ReportesDominio 0:M  ------ 1:1  PlantillaReporte [PlantillaReporte]</code>
     *
     * @throws SystemException if there is any error on having gotten a related instance.
     * @return The instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     */
    @JsonIgnore
    public Collection <ReportesDominio> getReportesDominio() {
        return reportesDominio;
    }

    /**
     * Adds an instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * @param reportesDominio The instance to add to the <code>ReportesDominio</code> role.
     */
    public void add2ReportesDominio(ReportesDominio reportesDominio) {
        this.reportesDominio.add(reportesDominio);
    }
    /**
     * Removes an instance of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * @param reportesDominio The instance to be removed
     */
    public void removeFromReportesDominio(ReportesDominio reportesDominio) {
    	this.reportesDominio.remove(reportesDominio);
    }
    /**
     * Sets instances of <code>ReportesDominio</code> related through the <code>ReportesDominio</code> role.
     * @param reportesDominio The new value for the <code>ReportesDominio</code> role.
     */
    public void setReportesDominio(Collection < ReportesDominio > reportesDominio) {
        this.reportesDominio = reportesDominio;
    }

   /**
    * This method gets the attribute value <code>modifiedReportesDominio</code> has been modified.
    * @return a boolean value that indicates if the attribute <code>modifiedReportesDominio</code> has been modified.
    */
    public boolean isModifiedReportesDominio(){
        return modifiedReportesDominio;
    }

    /**
     * Returns a Map with the values of the attributes.
     * @return Map with the values of the attributes.
     */
    @JsonIgnore
	@Override
    public Map<String, Object> getValues() {
        return values;
    }
    /**
     * This method initializes the properties of the entity and its relations.
     */
    private void initAttributes() {
        plantillaReporteTipo = Long.valueOf(0);
        plantillaReporteTitulo = "";
        plantillaReporteFechaVigencia = Date.valueOf(Constants.DATE_DEFAULTVALUE);
        plantillaReporteRutaArchivos = "";
        plantillaReporteNombreArchivoPDF = "";
        reportesDominio = null;
        values = new HashMap<>();

        clearModifiedFlags();
    }

    @Override
    protected Method[] getMethods() {
    	return PlantillaReporte.class.getMethods();
    }

    
    @Override
    protected String getClassAttributeType(String attribute) {
    	return PlantillaReporteConstants.ATTRIBUTE_TYPES.get(attribute.toUpperCase());
    }

    /**
     * Returns the data type of the <code>attribute</code> defined in <code>role</code>.
     * @param role the owner class of the attribute.
     * @param attribute the attribute name whose data type name is to be returned.
     * @return the data type name of the given attribute or null if the attribute does not exist.
     */
    @Override
    public String getAttributeTypeRelated(String role, String attribute) {
        String returnedType = "";
        return returnedType;
    }


   /**
    * This method sets all flags modifiers with false value.
    */
	@Override	
    public void clearModifiedFlags() {
    	values = new HashMap<>();
    	modifiedPlantillaReporteTipo = false;
    	values.put("plantillaReporteTipo", getPlantillaReporteTipo());
    	modifiedPlantillaReporteTitulo = false;
    	values.put("plantillaReporteTitulo", getPlantillaReporteTitulo());
    	modifiedPlantillaReporteFechaVigencia = false;
    	values.put("plantillaReporteFechaVigencia", getPlantillaReporteFechaVigencia());
    	modifiedPlantillaReporteRutaArchivos = false;
    	values.put("plantillaReporteRutaArchivos", getPlantillaReporteRutaArchivos());
    	modifiedPlantillaReporteNombreArchivoPDF = false;
    	values.put("plantillaReporteNombreArchivoPDF", getPlantillaReporteNombreArchivoPDF());
    	modifiedReportesDominio = false;
    }

    /**
     * This method sets all the derived attributes with null value.
     */
	@Override
    public void cleanDerivations() {
        // There are no derivations defined in this class
    }

    /**
     * Returns the <code>PlantillaReporteOid</code> object that identifies this instance of <code>PlantillaReporte</code>.
     * @return <code>PlantillaReporteOid </code> object that identifies this instance of <code>PlantillaReporte</code>
     */
	@Override
    public PlantillaReporteOid getOid() {
        return new PlantillaReporteOid(getPlantillaReporteidPlantillaReporte());
    }

    
    @Override
    protected boolean isAttributeVisible(String item) {
        return getAgent().isAnyFacetActive(PlantillaReporteConstants.ATTRIBUTE_AGENTS.get(item.toUpperCase()));
    }

    /**
     * Gets the list of active facets.
     * @return the list of active facets.
     */
    @JsonIgnore
	@Override
    public List<String> getActiveFacets() {
        return this.getFacets();
    }

     /**
     * Gets the list of active facets recursively from the root of the inheritance net.
     * @return the list of active facets.
     */
    @JsonIgnore
    public List<String> getFacets() {
        List<String> activeFacets = new ArrayList<>();

        if (!activeFacets.contains(Constants.PLANTILLAREPORTE)) {
            // Add this class
            activeFacets.add(Constants.PLANTILLAREPORTE);
        }
        return activeFacets;
    }

    /**
     * Returns true if this instance can be observed by the connected agent.
     * @param agent Connected agent instance
     * @return TRUE if the connected agent can observe this instance. FALSE otherwise.
     */
    @Override
    public boolean checkHorizontalVisibility(IEntity agent) {
        boolean returnValue = (!this.isNull());

        if (agent == null) return returnValue;


        if (getAgent().isFacetActive(Constants.ADMIN) || getAgent().isFacetActive(Constants.SUPERADMIN) || getAgent().isFacetActive(Constants.ASESOR) || getAgent().isFacetActive(Constants.AREAMEDICA) || getAgent().isFacetActive(Constants.AFILIACIONES) || getAgent().isFacetActive(Constants.GESTOR) || getAgent().isFacetActive(Constants.MESADEAPOYO)) {
            returnValue = true;
        }
        return returnValue;
    }

    /**
     * Checks Integrity Constraints defined in the class this entity is an instance of.
     * <p>
     * Raises an exception whenever an Integrity Constraint does not hold.
     * @throws IntegrityConstraintException if an integrity constraint isn't fulfilled.
     * @throws SystemException if there is any error on having checked integrity constraints.
     */
	@Override
    public void checkIntegrityConstraints() throws IntegrityConstraintException, SystemException {
        /* There are no Integrity Constraints defined in this class */
    }

    public static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstanceJsonOid != null && relatedInstancePath != null) {
            List<String> relatedInstancePathItems = new ArrayList<>(Arrays.asList(relatedInstancePath.split("\\.")));
            String pathItem = relatedInstancePathItems.remove(0);
            String remainingPath = String.join(".", relatedInstancePathItems);
            relatedInstance = buildRelatedInstance(relatedInstanceJsonOid, pathItem, remainingPath);
        }
        return relatedInstance;
    }

    private static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty() && remainingPath.isEmpty()) {
            relatedInstance = buildPlantillaReporteRelatedInstance(relatedInstanceJsonOid);
        }
        if (PlantillaReporteConstants.ROLE_NAME_REPORTESDOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlantillaReporteRelatedInstance4ReportesDominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPlantillaReporteRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PlantillaReporte(mapper.readValue(relatedInstanceJsonOid, PlantillaReporteOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaReporte.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlantillaReporteRelatedInstance4ReportesDominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesDominio(mapper.readValue(relatedInstanceJsonOid, ReportesDominioOid.class)): ReportesDominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaReporte.class).error(e.getMessage());
            return null;
        }
    }
}
