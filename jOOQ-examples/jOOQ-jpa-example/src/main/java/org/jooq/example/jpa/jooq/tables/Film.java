/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables;


import java.time.Year;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.jpa.jooq.DefaultSchema;
import org.jooq.example.jpa.jooq.Keys;
import org.jooq.example.jpa.jooq.tables.records.FilmRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Film extends TableImpl<FilmRecord> {

    private static final long serialVersionUID = 1375443672;

    /**
     * The reference instance of <code>FILM</code>
     */
    public static final Film FILM = new Film();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmRecord> getRecordType() {
        return FilmRecord.class;
    }

    /**
     * The column <code>FILM.FILMID</code>.
     */
    public final TableField<FilmRecord, Integer> FILMID = createField(DSL.name("FILMID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>FILM.LENGTH</code>.
     */
    public final TableField<FilmRecord, Integer> LENGTH = createField(DSL.name("LENGTH"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>FILM.RELEASE_YEAR</code>.
     */
    public final TableField<FilmRecord, Year> RELEASE_YEAR = createField(DSL.name("RELEASE_YEAR"), org.jooq.impl.SQLDataType.INTEGER, this, "", new org.jooq.impl.JPAConverter(org.jooq.example.jpa.converters.YearConverter.class));

    /**
     * The column <code>FILM.TITLE</code>.
     */
    public final TableField<FilmRecord, String> TITLE = createField(DSL.name("TITLE"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>FILM.LANGUAGE_LANGUAGEID</code>.
     */
    public final TableField<FilmRecord, Integer> LANGUAGE_LANGUAGEID = createField(DSL.name("LANGUAGE_LANGUAGEID"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>FILM.ORIGINALLANGUAGE_LANGUAGEID</code>.
     */
    public final TableField<FilmRecord, Integer> ORIGINALLANGUAGE_LANGUAGEID = createField(DSL.name("ORIGINALLANGUAGE_LANGUAGEID"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>FILM</code> table reference
     */
    public Film() {
        this(DSL.name("FILM"), null);
    }

    /**
     * Create an aliased <code>FILM</code> table reference
     */
    public Film(String alias) {
        this(DSL.name(alias), FILM);
    }

    /**
     * Create an aliased <code>FILM</code> table reference
     */
    public Film(Name alias) {
        this(alias, FILM);
    }

    private Film(Name alias, Table<FilmRecord> aliased) {
        this(alias, aliased, null);
    }

    private Film(Name alias, Table<FilmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Film(Table<O> child, ForeignKey<O, FilmRecord> key) {
        super(child, key, FILM);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<FilmRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FILM;
    }

    @Override
    public UniqueKey<FilmRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_2;
    }

    @Override
    public List<UniqueKey<FilmRecord>> getKeys() {
        return Arrays.<UniqueKey<FilmRecord>>asList(Keys.CONSTRAINT_2);
    }

    @Override
    public List<ForeignKey<FilmRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilmRecord, ?>>asList(Keys.FKD2YJC1RU34H1SMWLA3FX7B6NX, Keys.FKN2UB730RPO5B5E9X6U2LWL9FT);
    }

    public Language fkd2yjc1ru34h1smwla3fx7b6nx() {
        return new Language(this, Keys.FKD2YJC1RU34H1SMWLA3FX7B6NX);
    }

    public Language fkn2ub730rpo5b5e9x6u2lwl9ft() {
        return new Language(this, Keys.FKN2UB730RPO5B5E9X6U2LWL9FT);
    }

    @Override
    public Film as(String alias) {
        return new Film(DSL.name(alias), this);
    }

    @Override
    public Film as(Name alias) {
        return new Film(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(String name) {
        return new Film(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Name name) {
        return new Film(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Year, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
