/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.spark.sql.catalyst.encoders;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Money extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2836018423368943294L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Money\",\"namespace\":\"org.apache.spark.sql.catalyst.encoders\",\"fields\":[{\"name\":\"amount\",\"type\":\"float\",\"default\":0},{\"name\":\"currency\",\"type\":{\"type\":\"enum\",\"name\":\"Currency\",\"symbols\":[\"EUR\",\"USD\",\"BRL\"]},\"default\":\"EUR\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Money> ENCODER =
      new BinaryMessageEncoder<Money>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Money> DECODER =
      new BinaryMessageDecoder<Money>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Money> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Money> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Money>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Money to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Money from a ByteBuffer. */
  public static Money fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public float amount;
  @Deprecated public org.apache.spark.sql.catalyst.encoders.Currency currency;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Money() {}

  /**
   * All-args constructor.
   * @param amount The new value for amount
   * @param currency The new value for currency
   */
  public Money(java.lang.Float amount, org.apache.spark.sql.catalyst.encoders.Currency currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return amount;
    case 1: return currency;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: amount = (java.lang.Float)value$; break;
    case 1: currency = (org.apache.spark.sql.catalyst.encoders.Currency)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public java.lang.Float getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(java.lang.Float value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'currency' field.
   * @return The value of the 'currency' field.
   */
  public org.apache.spark.sql.catalyst.encoders.Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the value of the 'currency' field.
   * @param value the value to set.
   */
  public void setCurrency(org.apache.spark.sql.catalyst.encoders.Currency value) {
    this.currency = value;
  }

  /**
   * Creates a new Money RecordBuilder.
   * @return A new Money RecordBuilder
   */
  public static org.apache.spark.sql.catalyst.encoders.Money.Builder newBuilder() {
    return new org.apache.spark.sql.catalyst.encoders.Money.Builder();
  }

  /**
   * Creates a new Money RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Money RecordBuilder
   */
  public static org.apache.spark.sql.catalyst.encoders.Money.Builder newBuilder(org.apache.spark.sql.catalyst.encoders.Money.Builder other) {
    return new org.apache.spark.sql.catalyst.encoders.Money.Builder(other);
  }

  /**
   * Creates a new Money RecordBuilder by copying an existing Money instance.
   * @param other The existing instance to copy.
   * @return A new Money RecordBuilder
   */
  public static org.apache.spark.sql.catalyst.encoders.Money.Builder newBuilder(org.apache.spark.sql.catalyst.encoders.Money other) {
    return new org.apache.spark.sql.catalyst.encoders.Money.Builder(other);
  }

  /**
   * RecordBuilder for Money instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Money>
    implements org.apache.avro.data.RecordBuilder<Money> {

    private float amount;
    private org.apache.spark.sql.catalyst.encoders.Currency currency;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.spark.sql.catalyst.encoders.Money.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.currency)) {
        this.currency = data().deepCopy(fields()[1].schema(), other.currency);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Money instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.spark.sql.catalyst.encoders.Money other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.amount)) {
        this.amount = data().deepCopy(fields()[0].schema(), other.amount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.currency)) {
        this.currency = data().deepCopy(fields()[1].schema(), other.currency);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public java.lang.Float getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public org.apache.spark.sql.catalyst.encoders.Money.Builder setAmount(float value) {
      validate(fields()[0], value);
      this.amount = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public org.apache.spark.sql.catalyst.encoders.Money.Builder clearAmount() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'currency' field.
      * @return The value.
      */
    public org.apache.spark.sql.catalyst.encoders.Currency getCurrency() {
      return currency;
    }

    /**
      * Sets the value of the 'currency' field.
      * @param value The value of 'currency'.
      * @return This builder.
      */
    public org.apache.spark.sql.catalyst.encoders.Money.Builder setCurrency(org.apache.spark.sql.catalyst.encoders.Currency value) {
      validate(fields()[1], value);
      this.currency = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'currency' field has been set.
      * @return True if the 'currency' field has been set, false otherwise.
      */
    public boolean hasCurrency() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'currency' field.
      * @return This builder.
      */
    public org.apache.spark.sql.catalyst.encoders.Money.Builder clearCurrency() {
      currency = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Money build() {
      try {
        Money record = new Money();
        record.amount = fieldSetFlags()[0] ? this.amount : (java.lang.Float) defaultValue(fields()[0]);
        record.currency = fieldSetFlags()[1] ? this.currency : (org.apache.spark.sql.catalyst.encoders.Currency) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Money>
    WRITER$ = (org.apache.avro.io.DatumWriter<Money>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Money>
    READER$ = (org.apache.avro.io.DatumReader<Money>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
