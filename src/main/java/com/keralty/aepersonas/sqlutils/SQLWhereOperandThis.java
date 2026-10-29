package com.keralty.aepersonas.sqlutils;

import java.util.Collection;

import com.keralty.aepersonas.global.Constants;

/**
 * <code>SQLWhereOperandThis</code> is a special operand representing the
 * reserved keyword THIS To be used only if the OID value representing THIS is
 * not known.
 */
public class SQLWhereOperandThis extends SQLWhereOperandPathInstance {

    /**
     * New operand representing the OID of the searched class in the main SQL
     * sentence.
     */
    public SQLWhereOperandThis() {
        super("", "");
    }

    /**
     * Processes operand.
     * 
     * @param sql SQL object
     */
    @Override
    public void processOperand(SQLSelect sql) {
        setSql(sql);
        processOperandThis();
    }

    /**
     * Process the operand THIS Adds the OID fields to the comparison list.
     * 
     */
    private void processOperandThis() {

        String alias = "";
        String definitionClass = "";

        // Get the main SQL
        SQLSelect mainSQL = getSql();
        while (mainSQL.getSuperSelect() != null) {
            mainSQL = mainSQL.getSuperSelect();
        }

        // Use the main SQL alias
        alias = mainSQL.getStartingClassAlias().getAlias();
        definitionClass = mainSQL.getTargetEntityName();

        Collection<String> oidFields = Constants.getOIDFields(definitionClass);

        // Add the OID field to the comparison list
        for (String oidField : oidFields) {
            addOidExpression(alias + "." + oidField);
        }
    }
}
