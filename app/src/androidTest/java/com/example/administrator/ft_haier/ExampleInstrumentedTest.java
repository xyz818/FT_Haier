�}�  V/  �C��	�$ �a	��m#?��0&^)$ ��TEE�ǅ̶�KNϏ������tmߧޭyA.ܸ��O���B
T��«1��Gm�<�7�`��X.ݙ�6�(ׂ5�q%�>Ԕg���Tr���|��_*��j"g��-4v'R{7�kK%��0��*���=5�E���о�1n �QB۹ Ѵ����B�5���.�^��0S�CK�?�����6O�g��w#�w{���$�럏��r<��=��T�����͸�RUH�@�X��<O�ȽXF%Đ�b�v4��[�T���?Fbl�t	$�=b�W��g	�#ͨ���ؿ�vx�l��dG��^�P�	<D�J��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?� {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.administrator.ft_haier", appContext.getPackageName());
    }
}
