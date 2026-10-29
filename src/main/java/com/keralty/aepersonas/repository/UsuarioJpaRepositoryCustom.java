package com.keralty.aepersonas.repository;

import com.keralty.aepersonas.exception.SystemException;
import com.keralty.aepersonas.persistence.BeneficiarioC;
import com.keralty.aepersonas.persistence.Preexistencia;
import com.keralty.aepersonas.persistence.PreexistenciaC;
import com.keralty.aepersonas.persistence.Solicitud;
import com.keralty.aepersonas.persistence.Usuario;
import com.keralty.aepersonas.sqlutils.SQLCount;
import com.keralty.aepersonas.sqlutils.SQLExists;
import com.keralty.aepersonas.sqlutils.SQLGetOne;
import com.keralty.aepersonas.sqlutils.SQLParam;
import com.keralty.aepersonas.sqlutils.SQLPopulation;
import com.keralty.aepersonas.sqlutils.SQLSelect;
import com.keralty.aepersonas.sqlutils.SQLSum;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

public interface UsuarioJpaRepositoryCustom {

    List<Usuario> solveQuery(SQLSelect query);
    
    List<Usuario> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);
    
    Long nextUsuarioIdentificador(Long aesolicitudesidsolicitud);

    Boolean assocOperator000(Usuario instance) throws SystemException;

    Boolean assocOperator000Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator001(Usuario instance) throws SystemException;

    Boolean assocOperator001Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator001Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator002(Usuario instance) throws SystemException;

    Boolean assocOperator002Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator002Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator003(Usuario instance) throws SystemException;

    Boolean assocOperator003Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator003Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator004(Usuario instance) throws SystemException;

    Boolean assocOperator004Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator005(Usuario instance) throws SystemException;

    Boolean assocOperator005Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator005Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator006(Usuario instance) throws SystemException;

    Boolean assocOperator006Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator006Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator007(Usuario instance) throws SystemException;

    Boolean assocOperator007Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator007Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator008(Usuario instance) throws SystemException;

    Boolean assocOperator008Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator008Range1Query(Usuario instance) throws SystemException;

    String assocOperator009(Usuario instance) throws SystemException;

    String assocOperator009Range1(Usuario instance) throws SystemException;
    
    SQLGetOne assocOperator009Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator010(Usuario instance) throws SystemException;

    Boolean assocOperator010Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator010Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator011(Usuario instance) throws SystemException;

    Boolean assocOperator011Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator011Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator012(Usuario instance) throws SystemException;

    Boolean assocOperator012Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator012Range1Query(Usuario instance) throws SystemException;

    Long assocOperator013(Usuario instance) throws SystemException;

    Long assocOperator013Range1(Usuario instance) throws SystemException;
    
    SQLSum assocOperator013Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator014(Usuario instance) throws SystemException;

    Boolean assocOperator014Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator014Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator015(Usuario instance) throws SystemException;

    Boolean assocOperator015Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator015Range1Query(Usuario instance) throws SystemException;

    Long assocOperator016(Usuario instance) throws SystemException;

    Long assocOperator016Range1(Usuario instance) throws SystemException;
    
    SQLSum assocOperator016Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator017(Usuario instance) throws SystemException;

    Boolean assocOperator017Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator017Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator018(Usuario instance) throws SystemException;

    Boolean assocOperator018Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator018Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator019(Usuario instance) throws SystemException;

    Boolean assocOperator019Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator019Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator020(Usuario instance) throws SystemException;

    Boolean assocOperator020Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator020Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator021(Usuario instance) throws SystemException;

    Boolean assocOperator021Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator021Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator022(Usuario instance) throws SystemException;

    Boolean assocOperator022Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator022Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator023(Usuario instance) throws SystemException;

    Boolean assocOperator023Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator023Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator024(Usuario instance) throws SystemException;

    Boolean assocOperator024Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator024Range1Query(Usuario instance) throws SystemException;

    Long assocOperator025(Usuario instance) throws SystemException;

    Long assocOperator025Range1(Usuario instance) throws SystemException;
    
    SQLCount assocOperator025Range1Query(Usuario instance) throws SystemException;

    Long assocOperator026(Usuario instance) throws SystemException;

    Long assocOperator026Range1(Usuario instance) throws SystemException;
    
    SQLCount assocOperator026Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator027(Usuario instance) throws SystemException;

    Boolean assocOperator027Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator027Range1Query(Usuario instance) throws SystemException;

    Double assocOperator028(Usuario instance) throws SystemException;

    Double assocOperator028Range1(Usuario instance) throws SystemException;
    
    SQLSum assocOperator028Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator029(Usuario instance) throws SystemException;

    Boolean assocOperator029Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator029Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator030(Usuario instance) throws SystemException;

    Boolean assocOperator030Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator030Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator031(Solicitud usuarioTCREARptpagrSolicitud) throws SystemException;

    Boolean assocOperator031Range1(Solicitud usuarioTCREARptpagrSolicitud) throws SystemException;
    
    SQLExists assocOperator031Range1Query(Solicitud usuarioTCREARptpagrSolicitud, SQLSelect superQuery) throws SystemException;

    Boolean assocOperator032(Solicitud usuarioTCREARptpagrSolicitud) throws SystemException;

    Boolean assocOperator032Range1(Solicitud usuarioTCREARptpagrSolicitud) throws SystemException;
    
    SQLExists assocOperator032Range1Query(Solicitud usuarioTCREARptpagrSolicitud, SQLSelect superQuery) throws SystemException;

    Boolean assocOperator033(Usuario instance) throws SystemException;

    Boolean assocOperator033Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator033Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator034(Usuario instance) throws SystemException;

    Boolean assocOperator034Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator034Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator035(Usuario instance) throws SystemException;

    Boolean assocOperator035Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator035Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator038(Usuario instance) throws SystemException;

    Boolean assocOperator038Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator038Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator039(Usuario instance) throws SystemException;

    Boolean assocOperator039Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator039Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator042(Usuario instance) throws SystemException;

    Boolean assocOperator042Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator042Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator043(Usuario instance) throws SystemException;

    Boolean assocOperator043Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator043Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator044(Usuario instance) throws SystemException;

    Boolean assocOperator044Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator044Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator045(Usuario instance) throws SystemException;

    Boolean assocOperator045Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator045Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator049(Usuario instance) throws SystemException;

    Boolean assocOperator049Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator049Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator050(Usuario instance) throws SystemException;

    Boolean assocOperator050Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator050Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator051(Usuario instance) throws SystemException;

    Boolean assocOperator051Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator051Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator053(Usuario instance) throws SystemException;

    Boolean assocOperator053Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator053Range1Query(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator057(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator057Range1(Usuario instance) throws SystemException;
    
    SQLPopulation assocOperator057Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator058(Usuario instance) throws SystemException;

    Boolean assocOperator058Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator058Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator059(Usuario instance) throws SystemException;

    Boolean assocOperator059Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator059Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator060(Usuario instance) throws SystemException;

    Boolean assocOperator060Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator060Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator062(Usuario instance) throws SystemException;

    Boolean assocOperator062Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator062Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator064(Usuario instance) throws SystemException;

    Boolean assocOperator064Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator064Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator065(Usuario instance) throws SystemException;

    Boolean assocOperator065Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator065Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator066(Usuario instance) throws SystemException;

    Boolean assocOperator066Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator066Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator068(Usuario instance) throws SystemException;

    Boolean assocOperator068Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator068Range1Query(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator069(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator069Range1(Usuario instance) throws SystemException;
    
    SQLPopulation assocOperator069Range1Query(Usuario instance) throws SystemException;

    Collection<PreexistenciaC> assocOperator070(Usuario usuarioTACTDESDECOREpthisUsuario, BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException;

    Collection<PreexistenciaC> assocOperator070Range1(BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException;
    
    SQLPopulation assocOperator070Range1Query(BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException;

    Boolean assocOperator073(BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException;

    Boolean assocOperator073Range1(BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC) throws SystemException;
    
    SQLExists assocOperator073Range1Query(BeneficiarioC usuarioTACTDESDECOREpBeneficiarioC, SQLSelect superQuery) throws SystemException;

    Boolean assocOperator074(Usuario instance) throws SystemException;

    Boolean assocOperator074Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator074Range1Query(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator078(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator078Range1(Usuario instance) throws SystemException;
    
    SQLPopulation assocOperator078Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator079(Usuario instance) throws SystemException;

    Boolean assocOperator079Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator079Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator080(Usuario instance) throws SystemException;

    Boolean assocOperator080Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator080Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator081(Usuario instance) throws SystemException;

    Boolean assocOperator081Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator081Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator083(Usuario instance) throws SystemException;

    Boolean assocOperator083Range1(Usuario instance) throws SystemException;
    
    SQLExists assocOperator083Range1Query(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator084(Usuario instance) throws SystemException;

    Collection<Preexistencia> assocOperator084Range1(Usuario instance) throws SystemException;
    
    SQLPopulation assocOperator084Range1Query(Usuario instance) throws SystemException;

    Boolean assocOperator086(Usuario instance, String usuarioTADDPREEXISTptpatrDescripcion, Date usuarioTADDPREEXISTptpatrFecInicio, Date usuarioTADDPREEXISTptpatrFecFin) throws SystemException;

    Boolean assocOperator086Range1(Usuario instance, String usuarioTADDPREEXISTptpatrDescripcion, Date usuarioTADDPREEXISTptpatrFecInicio, Date usuarioTADDPREEXISTptpatrFecFin) throws SystemException;
    
    SQLExists assocOperator086Range1Query(Usuario instance, String usuarioTADDPREEXISTptpatrDescripcion, Date usuarioTADDPREEXISTptpatrFecInicio, Date usuarioTADDPREEXISTptpatrFecFin) throws SystemException;

    public List<Usuario> executeQuery(String query);

    public List<Usuario> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
