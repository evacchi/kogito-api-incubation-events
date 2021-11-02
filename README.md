Notes
=====

An event is a **point in time**. 

An event can be hooked:

  - `On`
  - `Before`
  - `After`

An event specifies when it can be hooked; e.g. only `On`, only `Before`, only `After` or a combination of these.

An event is Serializable (to JSON).

An event should be "small"; i.e. limit serialized payload size; it should contain references (identifiers) so that 
the extra data can be retrieved with an extra method call.

For instance an event may contain an identifier to a result instead of the result. 
If the listener needs the entire result, it will send a request for that result identifier.