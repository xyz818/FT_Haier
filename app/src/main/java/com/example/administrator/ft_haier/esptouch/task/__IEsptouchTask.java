�}  q
 �s!@�-� �a	��m#g���0J�;��@lҕo�һ���u�'+��P�;��V�;����@���A����Q&�RJ+G�Ӕ0�'�nk�]��H�oEV���kV�B�|;�����Ȗ#��40GѮh��'��>PS��&"D���s�����-�$O�L��I���kj��:H$�i���J�h����կ�]Z�z�^g{eL=Gu�h¹Bm��N�o�}qS�����j	j����RZ��3���ef|ֈ=�I�t�K5�X3�P��}B�6] �
/��͕�Z�+����F���t	$�=b�W��g	�#ͨ���ؿ�vx�l��dG��^�P�	<D�J��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?� the Application.
     */
    void interrupt();
    
    /**
     * Note: !!!Don't call the task at UI Main Thread or RuntimeException will be thrown Execute the Esptouch Task and
     * return the result
     * 
     * @return the IEsptouchResult
     * @throws RuntimeException
     */
    EsptouchResult executeForResult()
        throws RuntimeException;
    
    /**
     * Turn on or off the log.
     */
    static final boolean DEBUG = true;
    
    boolean isCancelled();
}
