/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskSummary implements org.apache.thrift7.TBase<TaskSummary, TaskSummary._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("TaskSummary");

  private static final org.apache.thrift7.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift7.protocol.TField("task_id", org.apache.thrift7.protocol.TType.I32, (short)1);
  private static final org.apache.thrift7.protocol.TField COMPONENT_ID_FIELD_DESC = new org.apache.thrift7.protocol.TField("component_id", org.apache.thrift7.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift7.protocol.TField HOST_FIELD_DESC = new org.apache.thrift7.protocol.TField("host", org.apache.thrift7.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift7.protocol.TField PORT_FIELD_DESC = new org.apache.thrift7.protocol.TField("port", org.apache.thrift7.protocol.TType.I32, (short)4);
  private static final org.apache.thrift7.protocol.TField UPTIME_SECS_FIELD_DESC = new org.apache.thrift7.protocol.TField("uptime_secs", org.apache.thrift7.protocol.TType.I32, (short)5);
  private static final org.apache.thrift7.protocol.TField ERRORS_FIELD_DESC = new org.apache.thrift7.protocol.TField("errors", org.apache.thrift7.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift7.protocol.TField STATS_FIELD_DESC = new org.apache.thrift7.protocol.TField("stats", org.apache.thrift7.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift7.protocol.TField COMPONENT_TYPE_FIELD_DESC = new org.apache.thrift7.protocol.TField("component_type", org.apache.thrift7.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift7.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift7.protocol.TField("status", org.apache.thrift7.protocol.TType.STRING, (short)9);

  private int task_id; // required
  private String component_id; // required
  private String host; // required
  private int port; // required
  private int uptime_secs; // required
  private List<ErrorInfo> errors; // required
  private TaskStats stats; // required
  private String component_type; // required
  private String status; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    TASK_ID((short)1, "task_id"),
    COMPONENT_ID((short)2, "component_id"),
    HOST((short)3, "host"),
    PORT((short)4, "port"),
    UPTIME_SECS((short)5, "uptime_secs"),
    ERRORS((short)6, "errors"),
    STATS((short)7, "stats"),
    COMPONENT_TYPE((short)8, "component_type"),
    STATUS((short)9, "status");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // COMPONENT_ID
          return COMPONENT_ID;
        case 3: // HOST
          return HOST;
        case 4: // PORT
          return PORT;
        case 5: // UPTIME_SECS
          return UPTIME_SECS;
        case 6: // ERRORS
          return ERRORS;
        case 7: // STATS
          return STATS;
        case 8: // COMPONENT_TYPE
          return COMPONENT_TYPE;
        case 9: // STATUS
          return STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TASK_ID_ISSET_ID = 0;
  private static final int __PORT_ISSET_ID = 1;
  private static final int __UPTIME_SECS_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift7.meta_data.FieldMetaData("task_id", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.COMPONENT_ID, new org.apache.thrift7.meta_data.FieldMetaData("component_id", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOST, new org.apache.thrift7.meta_data.FieldMetaData("host", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORT, new org.apache.thrift7.meta_data.FieldMetaData("port", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.UPTIME_SECS, new org.apache.thrift7.meta_data.FieldMetaData("uptime_secs", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32)));
    tmpMap.put(_Fields.ERRORS, new org.apache.thrift7.meta_data.FieldMetaData("errors", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.ListMetaData(org.apache.thrift7.protocol.TType.LIST, 
            new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, ErrorInfo.class))));
    tmpMap.put(_Fields.STATS, new org.apache.thrift7.meta_data.FieldMetaData("stats", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, TaskStats.class)));
    tmpMap.put(_Fields.COMPONENT_TYPE, new org.apache.thrift7.meta_data.FieldMetaData("component_type", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift7.meta_data.FieldMetaData("status", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(TaskSummary.class, metaDataMap);
  }

  public TaskSummary() {
  }

  public TaskSummary(
    int task_id,
    String component_id,
    String host,
    int port)
  {
    this();
    this.task_id = task_id;
    set_task_id_isSet(true);
    this.component_id = component_id;
    this.host = host;
    this.port = port;
    set_port_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskSummary(TaskSummary other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.task_id = other.task_id;
    if (other.is_set_component_id()) {
      this.component_id = other.component_id;
    }
    if (other.is_set_host()) {
      this.host = other.host;
    }
    this.port = other.port;
    this.uptime_secs = other.uptime_secs;
    if (other.is_set_errors()) {
      List<ErrorInfo> __this__errors = new ArrayList<ErrorInfo>();
      for (ErrorInfo other_element : other.errors) {
        __this__errors.add(new ErrorInfo(other_element));
      }
      this.errors = __this__errors;
    }
    if (other.is_set_stats()) {
      this.stats = new TaskStats(other.stats);
    }
    if (other.is_set_component_type()) {
      this.component_type = other.component_type;
    }
    if (other.is_set_status()) {
      this.status = other.status;
    }
  }

  public TaskSummary deepCopy() {
    return new TaskSummary(this);
  }

  @Override
  public void clear() {
    set_task_id_isSet(false);
    this.task_id = 0;
    this.component_id = null;
    this.host = null;
    set_port_isSet(false);
    this.port = 0;
    set_uptime_secs_isSet(false);
    this.uptime_secs = 0;
    this.errors = null;
    this.stats = null;
    this.component_type = null;
    this.status = null;
  }

  public int get_task_id() {
    return this.task_id;
  }

  public void set_task_id(int task_id) {
    this.task_id = task_id;
    set_task_id_isSet(true);
  }

  public void unset_task_id() {
    __isset_bit_vector.clear(__TASK_ID_ISSET_ID);
  }

  /** Returns true if field task_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_task_id() {
    return __isset_bit_vector.get(__TASK_ID_ISSET_ID);
  }

  public void set_task_id_isSet(boolean value) {
    __isset_bit_vector.set(__TASK_ID_ISSET_ID, value);
  }

  public String get_component_id() {
    return this.component_id;
  }

  public void set_component_id(String component_id) {
    this.component_id = component_id;
  }

  public void unset_component_id() {
    this.component_id = null;
  }

  /** Returns true if field component_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_component_id() {
    return this.component_id != null;
  }

  public void set_component_id_isSet(boolean value) {
    if (!value) {
      this.component_id = null;
    }
  }

  public String get_host() {
    return this.host;
  }

  public void set_host(String host) {
    this.host = host;
  }

  public void unset_host() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean is_set_host() {
    return this.host != null;
  }

  public void set_host_isSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int get_port() {
    return this.port;
  }

  public void set_port(int port) {
    this.port = port;
    set_port_isSet(true);
  }

  public void unset_port() {
    __isset_bit_vector.clear(__PORT_ISSET_ID);
  }

  /** Returns true if field port is set (has been assigned a value) and false otherwise */
  public boolean is_set_port() {
    return __isset_bit_vector.get(__PORT_ISSET_ID);
  }

  public void set_port_isSet(boolean value) {
    __isset_bit_vector.set(__PORT_ISSET_ID, value);
  }

  public int get_uptime_secs() {
    return this.uptime_secs;
  }

  public void set_uptime_secs(int uptime_secs) {
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
  }

  public void unset_uptime_secs() {
    __isset_bit_vector.clear(__UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field uptime_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_uptime_secs() {
    return __isset_bit_vector.get(__UPTIME_SECS_ISSET_ID);
  }

  public void set_uptime_secs_isSet(boolean value) {
    __isset_bit_vector.set(__UPTIME_SECS_ISSET_ID, value);
  }

  public int get_errors_size() {
    return (this.errors == null) ? 0 : this.errors.size();
  }

  public java.util.Iterator<ErrorInfo> get_errors_iterator() {
    return (this.errors == null) ? null : this.errors.iterator();
  }

  public void add_to_errors(ErrorInfo elem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ErrorInfo>();
    }
    this.errors.add(elem);
  }

  public List<ErrorInfo> get_errors() {
    return this.errors;
  }

  public void set_errors(List<ErrorInfo> errors) {
    this.errors = errors;
  }

  public void unset_errors() {
    this.errors = null;
  }

  /** Returns true if field errors is set (has been assigned a value) and false otherwise */
  public boolean is_set_errors() {
    return this.errors != null;
  }

  public void set_errors_isSet(boolean value) {
    if (!value) {
      this.errors = null;
    }
  }

  public TaskStats get_stats() {
    return this.stats;
  }

  public void set_stats(TaskStats stats) {
    this.stats = stats;
  }

  public void unset_stats() {
    this.stats = null;
  }

  /** Returns true if field stats is set (has been assigned a value) and false otherwise */
  public boolean is_set_stats() {
    return this.stats != null;
  }

  public void set_stats_isSet(boolean value) {
    if (!value) {
      this.stats = null;
    }
  }

  public String get_component_type() {
    return this.component_type;
  }

  public void set_component_type(String component_type) {
    this.component_type = component_type;
  }

  public void unset_component_type() {
    this.component_type = null;
  }

  /** Returns true if field component_type is set (has been assigned a value) and false otherwise */
  public boolean is_set_component_type() {
    return this.component_type != null;
  }

  public void set_component_type_isSet(boolean value) {
    if (!value) {
      this.component_type = null;
    }
  }

  public String get_status() {
    return this.status;
  }

  public void set_status(String status) {
    this.status = status;
  }

  public void unset_status() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean is_set_status() {
    return this.status != null;
  }

  public void set_status_isSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unset_task_id();
      } else {
        set_task_id((Integer)value);
      }
      break;

    case COMPONENT_ID:
      if (value == null) {
        unset_component_id();
      } else {
        set_component_id((String)value);
      }
      break;

    case HOST:
      if (value == null) {
        unset_host();
      } else {
        set_host((String)value);
      }
      break;

    case PORT:
      if (value == null) {
        unset_port();
      } else {
        set_port((Integer)value);
      }
      break;

    case UPTIME_SECS:
      if (value == null) {
        unset_uptime_secs();
      } else {
        set_uptime_secs((Integer)value);
      }
      break;

    case ERRORS:
      if (value == null) {
        unset_errors();
      } else {
        set_errors((List<ErrorInfo>)value);
      }
      break;

    case STATS:
      if (value == null) {
        unset_stats();
      } else {
        set_stats((TaskStats)value);
      }
      break;

    case COMPONENT_TYPE:
      if (value == null) {
        unset_component_type();
      } else {
        set_component_type((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unset_status();
      } else {
        set_status((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return Integer.valueOf(get_task_id());

    case COMPONENT_ID:
      return get_component_id();

    case HOST:
      return get_host();

    case PORT:
      return Integer.valueOf(get_port());

    case UPTIME_SECS:
      return Integer.valueOf(get_uptime_secs());

    case ERRORS:
      return get_errors();

    case STATS:
      return get_stats();

    case COMPONENT_TYPE:
      return get_component_type();

    case STATUS:
      return get_status();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return is_set_task_id();
    case COMPONENT_ID:
      return is_set_component_id();
    case HOST:
      return is_set_host();
    case PORT:
      return is_set_port();
    case UPTIME_SECS:
      return is_set_uptime_secs();
    case ERRORS:
      return is_set_errors();
    case STATS:
      return is_set_stats();
    case COMPONENT_TYPE:
      return is_set_component_type();
    case STATUS:
      return is_set_status();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskSummary)
      return this.equals((TaskSummary)that);
    return false;
  }

  public boolean equals(TaskSummary that) {
    if (that == null)
      return false;

    boolean this_present_task_id = true;
    boolean that_present_task_id = true;
    if (this_present_task_id || that_present_task_id) {
      if (!(this_present_task_id && that_present_task_id))
        return false;
      if (this.task_id != that.task_id)
        return false;
    }

    boolean this_present_component_id = true && this.is_set_component_id();
    boolean that_present_component_id = true && that.is_set_component_id();
    if (this_present_component_id || that_present_component_id) {
      if (!(this_present_component_id && that_present_component_id))
        return false;
      if (!this.component_id.equals(that.component_id))
        return false;
    }

    boolean this_present_host = true && this.is_set_host();
    boolean that_present_host = true && that.is_set_host();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_port = true;
    boolean that_present_port = true;
    if (this_present_port || that_present_port) {
      if (!(this_present_port && that_present_port))
        return false;
      if (this.port != that.port)
        return false;
    }

    boolean this_present_uptime_secs = true && this.is_set_uptime_secs();
    boolean that_present_uptime_secs = true && that.is_set_uptime_secs();
    if (this_present_uptime_secs || that_present_uptime_secs) {
      if (!(this_present_uptime_secs && that_present_uptime_secs))
        return false;
      if (this.uptime_secs != that.uptime_secs)
        return false;
    }

    boolean this_present_errors = true && this.is_set_errors();
    boolean that_present_errors = true && that.is_set_errors();
    if (this_present_errors || that_present_errors) {
      if (!(this_present_errors && that_present_errors))
        return false;
      if (!this.errors.equals(that.errors))
        return false;
    }

    boolean this_present_stats = true && this.is_set_stats();
    boolean that_present_stats = true && that.is_set_stats();
    if (this_present_stats || that_present_stats) {
      if (!(this_present_stats && that_present_stats))
        return false;
      if (!this.stats.equals(that.stats))
        return false;
    }

    boolean this_present_component_type = true && this.is_set_component_type();
    boolean that_present_component_type = true && that.is_set_component_type();
    if (this_present_component_type || that_present_component_type) {
      if (!(this_present_component_type && that_present_component_type))
        return false;
      if (!this.component_type.equals(that.component_type))
        return false;
    }

    boolean this_present_status = true && this.is_set_status();
    boolean that_present_status = true && that.is_set_status();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_task_id = true;
    builder.append(present_task_id);
    if (present_task_id)
      builder.append(task_id);

    boolean present_component_id = true && (is_set_component_id());
    builder.append(present_component_id);
    if (present_component_id)
      builder.append(component_id);

    boolean present_host = true && (is_set_host());
    builder.append(present_host);
    if (present_host)
      builder.append(host);

    boolean present_port = true;
    builder.append(present_port);
    if (present_port)
      builder.append(port);

    boolean present_uptime_secs = true && (is_set_uptime_secs());
    builder.append(present_uptime_secs);
    if (present_uptime_secs)
      builder.append(uptime_secs);

    boolean present_errors = true && (is_set_errors());
    builder.append(present_errors);
    if (present_errors)
      builder.append(errors);

    boolean present_stats = true && (is_set_stats());
    builder.append(present_stats);
    if (present_stats)
      builder.append(stats);

    boolean present_component_type = true && (is_set_component_type());
    builder.append(present_component_type);
    if (present_component_type)
      builder.append(component_type);

    boolean present_status = true && (is_set_status());
    builder.append(present_status);
    if (present_status)
      builder.append(status);

    return builder.toHashCode();
  }

  public int compareTo(TaskSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TaskSummary typedOther = (TaskSummary)other;

    lastComparison = Boolean.valueOf(is_set_task_id()).compareTo(typedOther.is_set_task_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_task_id()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.task_id, typedOther.task_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_component_id()).compareTo(typedOther.is_set_component_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_component_id()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.component_id, typedOther.component_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_host()).compareTo(typedOther.is_set_host());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_host()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.host, typedOther.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_port()).compareTo(typedOther.is_set_port());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_port()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.port, typedOther.port);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_uptime_secs()).compareTo(typedOther.is_set_uptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_uptime_secs()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.uptime_secs, typedOther.uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_errors()).compareTo(typedOther.is_set_errors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_errors()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.errors, typedOther.errors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_stats()).compareTo(typedOther.is_set_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_stats()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.stats, typedOther.stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_component_type()).compareTo(typedOther.is_set_component_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_component_type()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.component_type, typedOther.component_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_status()).compareTo(typedOther.is_set_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_status()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TASK_ID
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.task_id = iprot.readI32();
            set_task_id_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COMPONENT_ID
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.component_id = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // HOST
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.host = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PORT
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.port = iprot.readI32();
            set_port_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // UPTIME_SECS
          if (field.type == org.apache.thrift7.protocol.TType.I32) {
            this.uptime_secs = iprot.readI32();
            set_uptime_secs_isSet(true);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // ERRORS
          if (field.type == org.apache.thrift7.protocol.TType.LIST) {
            {
              org.apache.thrift7.protocol.TList _list185 = iprot.readListBegin();
              this.errors = new ArrayList<ErrorInfo>(_list185.size);
              for (int _i186 = 0; _i186 < _list185.size; ++_i186)
              {
                ErrorInfo _elem187; // required
                _elem187 = new ErrorInfo();
                _elem187.read(iprot);
                this.errors.add(_elem187);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // STATS
          if (field.type == org.apache.thrift7.protocol.TType.STRUCT) {
            this.stats = new TaskStats();
            this.stats.read(iprot);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // COMPONENT_TYPE
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.component_type = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // STATUS
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.status = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
    oprot.writeI32(this.task_id);
    oprot.writeFieldEnd();
    if (this.component_id != null) {
      oprot.writeFieldBegin(COMPONENT_ID_FIELD_DESC);
      oprot.writeString(this.component_id);
      oprot.writeFieldEnd();
    }
    if (this.host != null) {
      oprot.writeFieldBegin(HOST_FIELD_DESC);
      oprot.writeString(this.host);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PORT_FIELD_DESC);
    oprot.writeI32(this.port);
    oprot.writeFieldEnd();
    if (is_set_uptime_secs()) {
      oprot.writeFieldBegin(UPTIME_SECS_FIELD_DESC);
      oprot.writeI32(this.uptime_secs);
      oprot.writeFieldEnd();
    }
    if (this.errors != null) {
      if (is_set_errors()) {
        oprot.writeFieldBegin(ERRORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift7.protocol.TList(org.apache.thrift7.protocol.TType.STRUCT, this.errors.size()));
          for (ErrorInfo _iter188 : this.errors)
          {
            _iter188.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.stats != null) {
      if (is_set_stats()) {
        oprot.writeFieldBegin(STATS_FIELD_DESC);
        this.stats.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.component_type != null) {
      if (is_set_component_type()) {
        oprot.writeFieldBegin(COMPONENT_TYPE_FIELD_DESC);
        oprot.writeString(this.component_type);
        oprot.writeFieldEnd();
      }
    }
    if (this.status != null) {
      if (is_set_status()) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeString(this.status);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskSummary(");
    boolean first = true;

    sb.append("task_id:");
    sb.append(this.task_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("component_id:");
    if (this.component_id == null) {
      sb.append("null");
    } else {
      sb.append(this.component_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("port:");
    sb.append(this.port);
    first = false;
    if (is_set_uptime_secs()) {
      if (!first) sb.append(", ");
      sb.append("uptime_secs:");
      sb.append(this.uptime_secs);
      first = false;
    }
    if (is_set_errors()) {
      if (!first) sb.append(", ");
      sb.append("errors:");
      if (this.errors == null) {
        sb.append("null");
      } else {
        sb.append(this.errors);
      }
      first = false;
    }
    if (is_set_stats()) {
      if (!first) sb.append(", ");
      sb.append("stats:");
      if (this.stats == null) {
        sb.append("null");
      } else {
        sb.append(this.stats);
      }
      first = false;
    }
    if (is_set_component_type()) {
      if (!first) sb.append(", ");
      sb.append("component_type:");
      if (this.component_type == null) {
        sb.append("null");
      } else {
        sb.append(this.component_type);
      }
      first = false;
    }
    if (is_set_status()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_task_id()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'task_id' is unset! Struct:" + toString());
    }

    if (!is_set_component_id()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'component_id' is unset! Struct:" + toString());
    }

    if (!is_set_host()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'host' is unset! Struct:" + toString());
    }

    if (!is_set_port()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'port' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
