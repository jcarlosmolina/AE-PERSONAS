package com.keralty.aepersonas.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SPResultRow {

    private List<SPResultRowField> fields;

    public SPResultRow() {
        fields = new ArrayList<>();
	}

    public SPResultRow(Object[] row, List<String> fieldNames) {
        fields = new ArrayList<>();
        int pos = 0;
        for(Object rowField : row) {
            addField(fieldNames.get(pos++), rowField);
        }
    }

    public void addField(String name, Object value) {
        fields.add(new SPResultRowField(name, value));
    }

    public Object getField(String name) {
        Optional<SPResultRowField> field = fields.stream().filter(x -> x.getName().equalsIgnoreCase(name)).findFirst();
        return field.isPresent() ? field.get().getValue() : null;
    }

    public boolean hasField(String name) {
        Optional<SPResultRowField> field = fields.stream().filter(x -> x.getName().equalsIgnoreCase(name)).findFirst();
        return field.isPresent() && field.get().getValue() != null;
    }
}
