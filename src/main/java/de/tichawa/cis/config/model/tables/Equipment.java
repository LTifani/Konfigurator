/*
 * This file is generated by jOOQ.
 */
package de.tichawa.cis.config.model.tables;


import de.tichawa.cis.config.model.Keys;
import de.tichawa.cis.config.model.Tivicc;
import de.tichawa.cis.config.model.tables.records.EquipmentRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Equipment extends TableImpl<EquipmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>tivicc.equipment</code>
     */
    public static final Equipment EQUIPMENT = new Equipment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EquipmentRecord> getRecordType() {
        return EquipmentRecord.class;
    }

    /**
     * The column <code>tivicc.equipment.art_no</code>.
     */
    public final TableField<EquipmentRecord, Integer> ART_NO = createField(DSL.name("art_no"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>tivicc.equipment.select_code</code>.
     */
    public final TableField<EquipmentRecord, String> SELECT_CODE = createField(DSL.name("select_code"), SQLDataType.VARCHAR(45).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>tivicc.equipment.amount</code>.
     */
    public final TableField<EquipmentRecord, String> AMOUNT = createField(DSL.name("amount"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    private Equipment(Name alias, Table<EquipmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Equipment(Name alias, Table<EquipmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>tivicc.equipment</code> table reference
     */
    public Equipment(String alias) {
        this(DSL.name(alias), EQUIPMENT);
    }

    /**
     * Create an aliased <code>tivicc.equipment</code> table reference
     */
    public Equipment(Name alias) {
        this(alias, EQUIPMENT);
    }

    /**
     * Create a <code>tivicc.equipment</code> table reference
     */
    public Equipment() {
        this(DSL.name("equipment"), null);
    }

    public <O extends Record> Equipment(Table<O> child, ForeignKey<O, EquipmentRecord> key) {
        super(child, key, EQUIPMENT);
    }

    @Override
    public Schema getSchema() {
        return Tivicc.TIVICC;
    }

    @Override
    public List<ForeignKey<EquipmentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EquipmentRecord, ?>>asList(Keys.EQUIPMENT_PRICE_ART_NO_FK);
    }

    private transient Price _price;

    public Price price() {
        if (_price == null)
            _price = new Price(this, Keys.EQUIPMENT_PRICE_ART_NO_FK);

        return _price;
    }

    @Override
    public Equipment as(String alias) {
        return new Equipment(DSL.name(alias), this);
    }

    @Override
    public Equipment as(Name alias) {
        return new Equipment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Equipment rename(String name) {
        return new Equipment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Equipment rename(Name name) {
        return new Equipment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
